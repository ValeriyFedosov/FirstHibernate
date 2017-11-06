package ua.ustiuhova.main;

import org.hibernate.Session;
import ua.ustiuhova.entity.PersonEntity;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 05.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        List<PersonEntity> list = new LinkedList<PersonEntity>();
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFio("Ustiuhova Yevheniia S.");
        list.add(personEntity);
        PersonEntity anotherPerson = new PersonEntity();
        anotherPerson.setFio("Ustiuhov Anton S.");
        list.add(anotherPerson);
        for (PersonEntity person : list) {
            session.save(person);
        }
        session.getTransaction().commit();
        session.close();
        return;
    }
}
