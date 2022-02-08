package ex;

import org.testng.annotations.Test;

public class InvocationCount {
    int i=1;

    @Test(invocationCount =4 )
    public void runThisTestCaseSeveralTimes()
    {
        System.out.println("Test Case run: " + i + " Times");
        i++;
    }
}
