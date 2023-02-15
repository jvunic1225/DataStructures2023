package edu.monmouth.assingment1;

public class dog implements Animal {
	
	protected String furColor;
	
	
    public String getFurColor() {
    	System.out.println();
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	@Override
    public void makeSound() {
        System.out.println("I bark");
    }

    @Override
    public void move() {
        System.out.println("I run with four legs");
    }

	@Override
	public String toString() {
		return "dog [furColor=" + furColor + "]";
	}


}

