package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner implements ITestListener {

    // This belongs to ITestListener and will execute before starting of Test set/batch
    public void onStart(ITestContext arg) {
        System.out.println("Start test execute" + arg.getName());
    }


    // This belongs to ITestListener and will execute after starting of Test set/batch
    public void onFinish(ITestContext arg) {
        System.out.println("Finish test execute" + arg.getName());
    }

    // This belongs to the  ITestListener and will execute the before the main test start i.e. @Test
    public void onTestStart(ITestResult arg) {
        System.out.println("Starts test execute" + arg.getName());
    }

    // This belongs to the  ITestListener and will execute when test is skipped.
    public void onTestSkipped(ITestResult arg) {
        System.out.println("skipped test execute" + arg.getName());
    }

    // This belongs to the  ITestListener and will execute when test is passed
    public void onTestSuccess(ITestResult arg) {
        System.out.println("Passes test execute" + arg.getName());
    }

    // This belongs to the  ITestListener and will execute when test is passed
    public void onTestFailure(ITestResult arg) {
        System.out.println("Failed test execute" + arg.getName());
    }

    // Ignore this as a row
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg)
    {

    }
}