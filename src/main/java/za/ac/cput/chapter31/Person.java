package za.ac.cput.chapter31;

/**
 * Created by student on 2015/02/19.
 */
public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private String contactNumber;

    public Person() {

    }
    public Person(String id, String firstName, String lastName, String contactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {

        return String.format("ID: " + id + "\n" + "FirstName: " + firstName + "\n" + "LastName: " + lastName + "\n" + "ContactNumber: " + contactNumber);
    }
}
