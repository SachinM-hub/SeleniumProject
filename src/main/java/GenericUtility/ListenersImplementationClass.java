package GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementationClass implements  ITestListener{

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + "execution successfull!!");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+methodname+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"execution skips!!!");
	}

	
	}


