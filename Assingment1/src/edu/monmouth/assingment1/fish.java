package edu.monmouth.assingment1;

public class fish implements Animal {
	
	protected String color;
	
	
    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
    public void makeSound() {
        System.out.println("glub");
    }

    @Override
    public void move() {
        System.out.println("I move my fins");
    }

	@Override
	public String toString() {
		return "fish [color=" + color + "]";
	}


}

