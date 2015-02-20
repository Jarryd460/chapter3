package za.ac.cput.chapter31;

import java.util.HashSet;

/**
 * Created by student on 2015/02/19.
 */
public class MySet {

    private HashSet<Subject> subjects = new HashSet<Subject>();

    public void addSubject(String id, String subj, String lect) {

        Subject s = new Subject(id, subj, lect);
        subjects.add(s);
    }

    public boolean removeSubject(Subject s) {

        boolean found = false;

        for(int i = 0; i < subjects.size() && found == false; i++) {

            subjects.remove(s);	
			return true;			
        } 
        return false;        
    }

    public String toString(Subject s) {

        if(s != null) {

            return String.format(s.getId() + ": " + s.getName() + ": " + s.getLecturer());
        }
        else {

            return "No Subjects";
        }
    }
}
