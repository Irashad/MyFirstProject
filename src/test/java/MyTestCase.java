import org.testng.annotations.Test;

public class MyTestCase {

    //Test Case 1
    @Test
    public  void TC_01() throws Exception {
        int a=1;
        if(a > 0)
        {
            System.out.println("TC_01 passed");
        }
        else{
            throw new Exception();
        }
    }

    //Test Case 1
    @Test
    public  void TC_02() throws Exception {
        int a=1;
        if(a > 0)
        {
            System.out.println("TC_02 passed");
        }
        else{
            throw new Exception();
        }
    }

    //Test Case 1
    @Test
    public  void TC_03() throws Exception {
        int b=1;
        if(b > 0)
        {
            System.out.println("TC_03 passed");
        }
        else{
            throw new Exception();
        }
    }

}
