package za.ac.cput.chapter31;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by student on 2015/02/19.
 */
public class TestMySet {

    private HashSet<Subject> subjects = new HashSet<Subject>();
    private Subject s;

    @Before
    public void initialize() throws Exception{

        subjects = new HashSet<Subject>();
        s = new Subject("ISYA", "Information Systems 3 Module A", "Khan");
    }

    @Test
    public void add() throws Exception{

        subjects.add(s);
        Assert.assertEquals(true, subjects.contains(s));
    }

    @Test
    public void remove() throws Exception {

        boolean found = false;

        for(int i = 0; i < subjects.size() && found == false; i++) {

            subjects.remove(s);
        }

        Assert.assertEquals(false, subjects.contains(s));
    }
}
