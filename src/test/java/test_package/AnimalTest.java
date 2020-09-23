package test_package;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {
	
private IAnimalRepo ar;

@BeforeEach
public void before() {
	ar = new AnimalRepo();
}

@Test
public void isAnimal() {
	Animal a = new Animal();
	String animalMessage = ar.getAnimal(a);
	assertEquals("Hello, I'm an animal!", animalMessage);
}

@Test
public void isDog() {
	Dog d = new Dog();
	String dogMessage = ar.getAnimal(d);
	assertEquals("dog says: bark!", dogMessage);
}

@Test
public void isCat(){
	Cat c = new Cat();
	String catMessage = ar.getCat(c);
	assertEquals("cat says: meow!", catMessage);
}
@Test
public void isMale() {
	Reptile r = new Reptile(1, 1, "reptileName");
	String maleMessage = ar.getGender(r.getGender());
	assertEquals("male", maleMessage);
}

@Test
public void isFemale() {
	Reptile r = new Reptile(2, 1, "reptileName");
	String femaleMessage = ar.getGender(r.getGender());
	assertEquals("female", femaleMessage);
}

@Test
public void isOther() {
	Reptile r = new Reptile(3, 1, "reptileName");
	String otherMessage = ar.getGender(r.getGender());
	assertEquals("other", otherMessage);
}

}

