package SAMPLE1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionn {
    @Test
	public void softAssertStrictComparison(){
		String expectedData = "raja";
		String actualData = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualData, expectedData);
		System.out.println("strict comparison passed!!");

	}
    @Test
	public void containsLevelComparison() {
    	String expectedData = "raja";
		String actualData = "maharaja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("strict comparison passed!!");	
		sa.assertAll();
    }
}
