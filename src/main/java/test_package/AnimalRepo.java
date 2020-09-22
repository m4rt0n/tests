package test_package;

public class AnimalRepo implements IAnimalRepo{

		public String getAnimal(Animal a) {
			return a.speak();
		}
		
		public String getDog(Dog d) {
			return d.speak();
		}
		
		public String getCat(Cat c) {
			return c.speak();
		}
		
	}

	

