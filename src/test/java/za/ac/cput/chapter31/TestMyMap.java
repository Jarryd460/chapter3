package za.ac.cput.chapter31;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by student on 2015/02/19.
 */
public class TestMyMap {

    private static HashMap<Integer, Person> person;
    Person p;

    @Before
    public void initialize() throws Exception{

        person = new HashMap<Integer, Person>();
        p = new Person("212101374", "Jarryd", "Deane", "0826912258");
    }

    @Test
    public void add() throws Exception{

        person.put(Integer.parseInt(p.getId()), p);
        Assert.assertEquals(true, person.get(212101374).equals(p));
    }

    @Test
    public void remove() throws Exception {

        person.remove(212101374);
        Assert.assertEquals(null, person.get(212101374));
    }
}
