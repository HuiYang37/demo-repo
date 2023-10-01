package demo_junit_tests;

import org.junit.Assert;
import org.junit.Test;

import pojos.Dog;

public class DogTest {

	@Test
	public void dogBarkTest() {
		Dog myDog = new Dog();
		Assert.assertTrue(String.format("expected <woof>, but actual <%s>.", myDog.bark()), myDog.bark().equals("woof"));
	}

}
