package ua.ustiuhova.main;

import org.hibernate.Session;
import ua.ustiuhova.entity.PersonEntity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 05.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        List<PersonEntity> list = new LinkedList<>();

        PersonEntity personEntity = new PersonEntity();
        personEntity.setFio("Person 1");
        list.add(personEntity);

        PersonEntity anotherPerson = new PersonEntity();
        anotherPerson.setFio("Person 2");
        list.add(anotherPerson);

        for (PersonEntity person : list) {
            Serializable id = session.save(person);
            System.out.println("Generated PK = " + id);
        }

        session.getTransaction().commit();
        session.close();
    }
}
