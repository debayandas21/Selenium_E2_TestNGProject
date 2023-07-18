package parallelScript;

import org.testng.annotations.Test;

public class SampleTestNG_classThree {
	
	
	@Test(groups="featureSix")
	public void testOne() {
		long id= Thread.currentThread().getId();
		System.out.println("Test 61 is a sample Tree- 1:: "+ id);
	}

	@Test(groups="featureSix")
	public void testTwo() {
		long id= Thread.currentThread().getId();
		System.out.println("Test 62 is a sample Tree- 2:; "+ id);
	}

	@Test(groups="featureSix")
	public void testThree() {
		long id= Thread.currentThread().getId();
		System.out.println("Test 63 is a sample Tree- 3:: "+ id);
	}
	
	@Test(groups="featureSix")
	public void testFour() {
		long id= Thread.currentThread().getId();
		System.out.println("Test 64 is a sample Tree- 4:: "+ id);
	}
}
