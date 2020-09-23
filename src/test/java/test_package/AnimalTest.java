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
	String maleMessage = ar.checkGender(r.getGender());
	assertEquals("male", maleMessage);
}

@Test
public void isFemale() {
	Reptile r = new Reptile(2, 1, "reptileName");
	String femaleMessage = ar.checkGender(r.getGender());
	assertEquals("female", femaleMessage);
}

@Test
public void isOther() {
	Reptile r = new Reptile(3, 1, "reptileName");
	String otherMessage = ar.checkGender(r.getGender());
	assertEquals("other", otherMessage);
}

@Test
public void isAgeYoung() {
	//young=age<10
	Reptile r = new Reptile(1, 9, "reptilename");
	String youngMessage = ar.checkAge(r.getAge());
	assertEquals("young", youngMessage);
}

@Test
public void isAgeAdult() {
	//adult=10<age<50
	Reptile r = new Reptile(1, 11, "reptilename");
	String adultMessage = ar.checkAge(r.getAge());
	assertEquals("adult", adultMessage);
}

@Test
public void isAgeOld() {
	//old=age>100
	Reptile r = new Reptile(1, 101, "reptilename");
	String oldMessage = ar.checkAge(r.getAge());
	assertEquals("old", oldMessage);
}

@Test
public void isNameShort() {
	//short=name.length<10
	Reptile r = new Reptile(1, 1, "name");
	String shortMessage = ar.checkName(r.getName());
	assertEquals("short", shortMessage);
}

@Test
public void isNameLong() {
	//long=name.length>10
	Reptile r = new Reptile(1, 1, "loooongname");
	String longMessage = ar.checkName(r.getName());
	assertEquals("long", longMessage);
}

}

