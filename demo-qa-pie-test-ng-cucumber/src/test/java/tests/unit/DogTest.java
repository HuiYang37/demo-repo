package tests.unit;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import pojos.Dog;

public class DogTest {

	@Test
	public void dogBarkTest() {
		Dog myDog = new Dog();
		assertEquals(myDog.bark(), "woof");
	}

}
