package edu.monmouth.assingment1;

public class guardDog extends dog {
	private short meanness;

	public short getMeanness() {
		return meanness;
	}

	public void setMeanness(short meanness){
		this.meanness = meanness;

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
		System.out.println("WOOF WOOF!!!");
	}

	@Override
	public void move() {
		System.out.println("I run very fast");
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}


