package edu.monmouth.assingment1;

public class shark extends fish{
	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
		
		
	}

	@Override
	public String getColor() {
		return super.getColor();
	}


	@Override
	public void setColor(String color) {
		super.setColor(color);
	}

	@Override
	public void makeSound() {
		System.out.println("I do not make noises");
		System.out.println("Sharks are silent, but deadly");
	}

	@Override
	public void move() {
		System.out.println("I use my tail to propell myself");

	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}


