package SAMPLE1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
@Test
public void hardAssertStrictComparison() {
	String expectedData = "raja";
	String actualData = "Raja";
	Assert.assertEquals(actualData, expectedData);
	System.out.println("Strict Comparison passed!!");
}
@Test
public void ContainsLevelComparison() {
	String expectedData = "raja";
	String actualData = "maharaja";
	Assert.assertTrue(actualData.contains(expectedData));
	System.out.println("contains Comparison passed!!");
   }
}
