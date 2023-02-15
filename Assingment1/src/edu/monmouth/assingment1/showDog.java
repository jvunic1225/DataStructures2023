package edu.monmouth.assingment1;

public class showDog extends dog {
	private String Breed;

	
	public String getBreed() {
		System.out.println();
		return Breed;
	}

	public void setBreed(String breed) {
		Breed = breed;
	}

	@Override
	public String getFurColor() {
		return super.getFurColor();
	}

	@Override
	public void setFurColor(String furColor) {

	}

	@Override
	public void makeSound() {
		System.out.println("arf arf!");
	}

	@Override
	public void move() {
		System.out.println("I prance around");
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}


