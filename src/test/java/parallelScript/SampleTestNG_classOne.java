package parallelScript;

import org.testng.annotations.Test;

public class SampleTestNG_classOne {
	
	
	@Test(groups="featurefour")
	public void testOne() {
		long id= Thread.currentThread().getId();
		System.out.println("Test 41 is a sample Tree- 1: " +id);
	}

	@Test(groups="featurefour")
	public void testTwo() {
		long id= Thread.currentThread().getId();
		System.out.println("Test 42 is a sample Tree- 2: "+ id);
	}

	@Test(groups="featurefive")
	public void testThree() {
		long id= Thread.currentThread().getId();
		System.out.println("Test 51 is a sample Tree- 3: "+id);
	}
}
