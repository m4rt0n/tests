package test_package;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	public void speak() {
		System.out.println("Hello, I'm an animal!");
	}
	
	static Animal a = new Animal();
	static Dog d = new Dog();
	static Cat c = new Cat();
	
	static void getAnimal(Animal a) {
		System.out.println("this is an animal");
	}
	
	static void getDog(Dog d) {
		System.out.println("this is a dog");
	}
	
	static void getCat(Cat c) {
		System.out.println("this is a cat");
	}
	
	public static void main(String[] args) {
		a.speak();
		d.speak();
		c.speak();
		getAnimal(a);
		getDog(d);
		getCat(c);
	}
}

