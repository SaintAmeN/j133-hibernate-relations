package pl.sda.hibernate;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-relations
 * @created 27.11.2022
 */
public class Main {
    public static void main(String[] args) {
        HibernateUtil.INSTANCE.getSessionFactory().openSession();
    }
}
