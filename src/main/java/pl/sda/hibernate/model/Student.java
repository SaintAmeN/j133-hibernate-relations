package pl.sda.hibernate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private double sredniaOcen;
}






