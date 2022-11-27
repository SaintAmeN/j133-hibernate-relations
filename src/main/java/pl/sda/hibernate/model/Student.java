package pl.sda.hibernate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-relations
 * @created 27.11.2022
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String imie;

    @Column(nullable = false)
    private String nazwisko;

//    @Column(nullable = false)
    private int rokRozpoczeciaStudiow;

    // nie chcemy, aby to była kolumna
    @Formula("(SELECT AVG(o.wartosc) FROM Ocena o WHERE o.uczen_id=id)")
    private Double sredniaOcen;

    // RELACJE
    @OneToMany(mappedBy = "uczen")
    private Set<Ocena> oceny;
}






