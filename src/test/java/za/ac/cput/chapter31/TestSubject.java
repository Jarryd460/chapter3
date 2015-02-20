package za.ac.cput.chapter31;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/19.
 */
public class TestSubject {

    Subject s;

    @Before
    public void initialize() throws Exception{

        s = new Subject();
    }

    @Test
    public void testID() throws Exception{

        s.setId("ISYA");
        Assert.assertEquals("ISYA", s.getId());
    }

    @Test
    public void testName() throws Exception{

        s.setName("Information Systems 3 Module A");
        Assert.assertEquals("Information Systems 3 Module A", s.getName());
    }

    @Test
    public void testLecturer() throws Exception{

        s.setLecturer("Khan");
        Assert.assertEquals("Khan", s.getLecturer());
    }
}
