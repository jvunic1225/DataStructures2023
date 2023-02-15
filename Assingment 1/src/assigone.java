import java.util.Scanner;
public class assigone {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		if (num<100) {
			int num1 = (num / 10);
			int num2 = (num % 10);
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));

		}	else if  (num<1000) {
				int num1 = (num / 100);
				int num2 = ((num / 10) % 10);
				int num3 = (num % 10);
				System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + (num1+num2+num3));

		}	else System.out.println("Input a valid number");
		}
}