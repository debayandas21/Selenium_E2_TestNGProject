package testScripts;

import org.testng.annotations.Test;

public class SampleTestNG_classTwo {
	@Test (groups="featureone")
	public void testFour() {
		System.out.println("Test 11 is a sample Tree-");
	}

	@Test (groups="featuretwo")
	public void testFive() {
		System.out.println("Test 21 is a sample Tree-");
	}

	@Test (groups="featurethree")
	public void testSix() {
		System.out.println("Test 31 is a sample Tree-");
	}
}
