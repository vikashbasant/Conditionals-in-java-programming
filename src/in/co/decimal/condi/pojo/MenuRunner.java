package in.co.decimal.condi.pojo;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = scan.nextInt();


		System.out.println("Enter number2: ");
		int number2 = scan.nextInt();

		System.out.println("Choices Available are ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		System.out.println("Choose Operation: ");
		int option = scan.nextInt();
		performOperationUsingSwitch(number1, number2, option);

	}

	public static void performOperationUsingSwitch(int number1, int number2, int option) {
		switch (option) {
		case 1:
			System.out.println(number1 + number2);
			break;

		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 / number2);
			break;
		case 4:
			System.out.println(number1 * number2);

		default:
			System.out.println("Invaild Operation");
			break;
		}
	}
}
