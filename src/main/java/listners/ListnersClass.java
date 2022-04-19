package listners;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listners.CustomListner.class)
public class ListnersClass
{
    @Test
    void Test1()
    {
        System.out.println("Hi Atmecs");
        Assert.assertEquals("A", "A");
    }

    @Test
    void Test2()
    {
        System.out.println("Hello Atmecs");
        Assert.assertEquals("A", "B");
    }


    @Test
    void Test3()
    {
        System.out.println("Hey Atmecs");
        Assert.assertEquals("A", "B");
        throw new SkipException("This is exception");
    }
}


