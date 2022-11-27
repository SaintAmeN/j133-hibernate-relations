package pl.sda.hibernate.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

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
public class Ocena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false)
    private double wartosc;

    // INSERT INTO OCENA VALUES(1, 4.5, now())
    @CreationTimestamp // odpowiednik SQL funkcja: now()
    private LocalDateTime dataCzasDodania;

    @Enumerated(value = EnumType.STRING)
    private Przedmiot przedmiot;

    // RELACJE
    @ManyToOne
    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
    private Student uczen; //  kolumna student_id
}










