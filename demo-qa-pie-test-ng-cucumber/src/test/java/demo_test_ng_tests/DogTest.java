package demo_test_ng_tests;

import org.testng.annotations.Test;

import pojos.Dog;

public class DogTest {

	@Test
	public void dogBarkTest() {
		Dog myDog = new Dog();
//		Assert.assertTrue(String.format("expected <woof>, but actual <%s>.", myDog.bark()), myDog.bark().equals("woof"));
	}

}
