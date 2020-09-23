package test_package;

public class AnimalMain {
	 
	public static void main(String[] args) {
System.out.println("xxx");
		IAnimalRepo ar = new AnimalRepo();

		 Animal a = new Animal();
		 Dog d = new Dog();
		 Cat c = new Cat();
		 Reptile turtle = new Reptile(1, 10, "turtle");

		a.speak();
		d.speak();
		c.speak();
		turtle.speak();

		ar.getAnimal(a);
		ar.getDog(d);
		ar.getCat(c);
		ar.checkGender(turtle.getGender());
		
	}
}
