package pl.sda.hibernate;

import pl.sda.hibernate.model.Ocena;
import pl.sda.hibernate.model.Student;

import java.util.HashSet;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-relations
 * @created 27.11.2022
 */
public class MainPokazToStringExclude {
    public static void main(String[] args) {
        Student student = Student.builder()
                .imie("Pawel")
                .oceny(new HashSet<>())
                .build();

        Ocena o = Ocena.builder()
                .uczen(student)
                .wartosc(4.0)
                .build();

        student.getOceny().add(o);

        Ocena druga = Ocena.builder()
                .wartosc(3.0)
                .uczen(student)
                .build();

        student.getOceny().add(druga);
    }
}
