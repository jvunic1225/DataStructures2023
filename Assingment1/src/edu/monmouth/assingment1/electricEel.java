package edu.monmouth.assingment1;

public class electricEel extends fish{
	private int watts;

	public int getWatts() {
		return watts;
	}

	public void setWatts(int watts) {
		this.watts = watts;
	}

	@Override
	public String getColor() {
		return getColor();
	}

	@Override
	public void setColor(String color) {
		
	}

	@Override
	public void makeSound() {
		System.out.println("I am filled with electricity!");
		System.out.println("ZZZZZZZTTTTT");

	}

	@Override
	public void move() {
		System.out.println("I slither through the ocean");
	
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}


