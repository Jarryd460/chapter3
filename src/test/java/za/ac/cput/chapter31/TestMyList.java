package za.ac.cput.chapter31;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/19.
 */
public class TestMyList {

    private MyList mark;

    @Before
    public void initialize() throws Exception{

        mark = new MyList();
    }

    @Test
    public void addMark() throws Exception{

        mark.addMark(65);
        Assert.assertEquals(65, mark.getMark(1));
    }

    @Test
    public void removeMark() throws Exception {

        mark.addMark(65);
        Assert.assertEquals(true, mark.removeMark(1));
    }
}
