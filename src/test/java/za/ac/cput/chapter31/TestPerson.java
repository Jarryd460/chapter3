package za.ac.cput.chapter31;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/19.
 */
public class TestPerson {

    Person p;

    @Before
    public void initialize() throws Exception{

        p = new Person();
    }

    @Test
    public void testID() throws Exception{

        p.setId("212101374");
        Assert.assertEquals("212101374", p.getId());
    }

    @Test
    public void testFirstName() throws Exception{

        p.setFirstName("Jarryd");
        Assert.assertEquals("Jarryd", p.getFirstName());
    }

    @Test
    public void testLastName() throws Exception{

        p.setLastName("Deane");
        Assert.assertEquals("Deane", p.getLastName());
    }

    @Test
    public void testContactNumber() throws Exception{

        p.setContactNumber("0826912258");
        Assert.assertEquals("0826912258", p.getContactNumber());
    }
}
