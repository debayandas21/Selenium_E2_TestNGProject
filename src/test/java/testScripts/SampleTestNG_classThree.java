package testScripts;

import org.testng.annotations.Test;

public class SampleTestNG_classThree {
	
	
	@Test(groups="featureSix")
	public void testOne() {
		System.out.println("Test 61 is a sample Tree- 1");
	}

	@Test(groups="featureSix")
	public void testTwo() {
		System.out.println("Test 62 is a sample Tree- 2");
	}

	@Test(groups="featureSix")
	public void testThree() {
		System.out.println("Test 63 is a sample Tree- 3");
	}
}
