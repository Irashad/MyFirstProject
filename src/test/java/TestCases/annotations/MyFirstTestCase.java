package TestCases.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestCase {


    @Test
    public void testCase01()
    {
        System.out.println("I must called 1");
    }


    @Test
    public void testCase02()
    {
        System.out.println("I must called 2");
    }



    @BeforeTest
    public void beforeTest()
    {
        System.out.println("I must called before everything");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("I must called after everything");

    }
}
