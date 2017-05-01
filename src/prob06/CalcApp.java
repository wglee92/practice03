package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		while( true ) { 
			System.out.print(">> ");
			input = scanner.nextLine();
			String[] str = input.split(" ");
			
			Arithmetic cal = null;

			switch(str[1]) {
			case "+":
				cal = new Add();
				break;
			case "-":
				cal = new Sub();
				break;
			case "/":
				cal = new Div();
				break;
			case "*":
				cal = new Mul();
				break;
			}
			cal.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
			System.out.println(">> " + cal.calculate() + "\n>> quit");
			/*  코드를 완성 합니다. */
		}
	}
}

