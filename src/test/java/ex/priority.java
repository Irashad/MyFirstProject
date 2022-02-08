package ex;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 0)
    public void best1()
    {
        System.out.println("best1");
    }

    @Test(priority = 1)
    public void aest2()
    {
        System.out.println("aest2");
    }
    @Test(priority = 3)
    public void test3()
    {
        System.out.println("test3");
    }
    @Test(priority = 4)
    public void test4()
    {
        System.out.println("test4");
    }
}
