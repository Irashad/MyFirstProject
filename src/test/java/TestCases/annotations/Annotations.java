package TestCases.annotations;

import org.testng.annotations.*;

public class Annotations {



    @BeforeMethod
    public void s1()
    {
        System.out.println("BeforeMethod");
    }

    @Test
    public void tc_01()
    {
        System.out.println("Test Case 1");

    }

    @Test
    public void tc_02()
    {
        System.out.println("Test Case 2");

    }

    @BeforeTest
    public void s2()
    {
        System.out.println("Base");
    }
        @AfterTest
    public void s3()
    {
        System.out.println("AfterTest");

    }

    @AfterMethod
    public void s4()
    {
        System.out.println("AfterMethod");
    }


}
