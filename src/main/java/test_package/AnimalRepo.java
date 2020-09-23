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
		
		public String checkGender(int gender) {
			if (gender == 1) {
				return "male";
			}
			if (gender == 2) {
				return "female";
			} else {
				return "other";
			}
		}
		
		public String checkAge(int age) {
			if (age<10) {
				return "young";
			}if(age<10 || age<50) {
				return "adult";
			}if(age>100){
				return "old";
			}else return "wrong age";				
		}
		
		public String checkName(String name) {
			if (name.length()<10) {
				return "short";
			}else return "long";
		}

	}

	

