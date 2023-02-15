package edu.monmouth.assingment1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Animal array[] = new Animal[6];
		
		dog Dog = new dog();
		Dog.setFurColor("Black");
		System.out.println(Dog.toString());
		Dog.makeSound();
		Dog.move();
		array[0] = Dog;

	System.out.println("\n");
	
		fish Fish = new fish();
		Fish.setColor("Red");
		System.out.println(Fish.toString());
		Fish.makeSound();
		Fish.move();
		array[1] = Fish;
		
	System.out.println("\n");
	
		guardDog GuardDog = new guardDog();
		GuardDog.setFurColor("White");
		GuardDog.setMeanness((short)10);
		System.out.println(GuardDog.toString());
		GuardDog.makeSound();
		GuardDog.move();
		array[2] = GuardDog;
		
	System.out.println("\n");
		
		showDog ShowDog = new showDog();
		ShowDog.setFurColor("Black and Brown");
		ShowDog.setBreed("Doberman");
		System.out.println(ShowDog.toString());
		ShowDog.makeSound();
		ShowDog.move();
		array[3] = ShowDog;
		
	System.out.println("\n");

		shark Shark = new shark();
		Shark.setLength(20);
		Shark.setColor("Gray");
		System.out.println(Shark.toString());
		Shark.makeSound();
		Shark.move();
		array[4] = Shark;

	System.out.println("\n");
	
		electricEel ElectricEel = new electricEel();
		ElectricEel.setWatts(1000);
		ElectricEel.setColor("Blue");
		System.out.println(ElectricEel.toString());
		ElectricEel.makeSound();
		ElectricEel.move();
		array[5] = ElectricEel;

		for (Animal animal : array) {
			System.out.println(animal.toString());
			animal.makeSound();
			animal.move();
			System.out.println("\n");
		}
		

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
			array[i].makeSound();
			array[i].move();
		}
		

		int i = 0;
		while (i < array.length) {
			System.out.println(array[i].toString());
			array[i].makeSound();
			array[i].move();
			i++;
		}
		
		System.out.println("All animals in the array:");
		System.out.println(Arrays.toString(array));
	}
}
