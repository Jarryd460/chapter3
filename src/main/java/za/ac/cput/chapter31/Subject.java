package za.ac.cput.chapter31;

/**
 * Created by student on 2015/02/19.
 */
public class Subject {

    private String id;
    private String name;
    private String lecturer;

    public Subject() {

    }

    public Subject(String id, String name, String lecturer) {
        this.id = id;
        this.name = name;
        this.lecturer = lecturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}
