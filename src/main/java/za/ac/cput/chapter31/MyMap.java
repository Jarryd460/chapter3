package za.ac.cput.chapter31;

import java.util.HashMap;

/**
 * Created by student on 2015/02/19.
 */
public class MyMap {

    private static HashMap<Integer, Person> person = new HashMap<Integer, Person>();

    public void addPerson(String id, String fn, String ln, String cn) {

        Person p = new Person(id, fn, ln, cn);
        person.put(Integer.parseInt(id), p);
    }

    public void removePerson(String id) {

        Person p = person.get(Integer.parseInt(id));

        if(p != null) {

            person.remove(Integer.parseInt(id));
        }
    }

    public String details(String id) {

        Person p = person.get(Integer.parseInt(id));

        if(p != null) {

            return String.format("ID: " + p.getId() + "\n" + "FirstName: " + p.getFirstName() + "\n" + "LastName: " + p.getLastName() + "\n" + "ContactNumber: " + p.getContactNumber());
        }
        else {

            return "Student doesnt exist";
        }
    }
}
