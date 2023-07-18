package testScripts;

import org.testng.annotations.Test;

public class SampleTestNG_classOne {
	
	
	@Test(groups="featurefour")
	public void testOne() {
		System.out.println("Test 41 is a sample Tree- 1");
	}

	@Test(groups="featurefour")
	public void testTwo() {
		System.out.println("Test 42 is a sample Tree- 2");
	}

	@Test(groups="featurefive")
	public void testThree() {
		System.out.println("Test 51 is a sample Tree- 3");
	}
}
