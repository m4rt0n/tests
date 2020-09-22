package test_package;

public class AnimalMain {
	 
	public static void main(String[] args) {

		IAnimalRepo ar = new AnimalRepo();

		 Animal a = new Animal();
		 Dog d = new Dog();
		 Cat c = new Cat();

		a.speak();
		d.speak();
		c.speak();

		ar.getAnimal(a);
		ar.getDog(d);
		ar.getCat(c);
	}
}
