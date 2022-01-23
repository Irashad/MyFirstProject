public class Main {
    public static void main(String[] args) throws Exception {
        TC_01();
        TC_02();
        TC_03();
    }


    //Test Case 1
    public static void TC_01() throws Exception {
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
    public static void TC_02() throws Exception {
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
    public static void TC_03() throws Exception {
        int b=0;
        if(b > 0)
        {
            System.out.println("TC_03 passed");
        }
        else{
            throw new Exception();
        }
    }
}
