package test_package;

public class Reptile extends Animal{

	private int gender;
	private int age;
	private String name;

	public Reptile(int gender, int age, String name) {
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
