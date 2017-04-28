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
			
			Arithmetic cal;

			switch(str[1]) {
			case "+":
				cal = new Add();
			case "-":
				cal = new Sub();
			case "/":
				cal = new Div();
			case "*":
				cal = new Mul();
			
			cal.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
			System.out.println(">> " + cal.calculate() + "\n>> quit");
			break;
			}
			/*  코드를 완성 합니다. */
		}
	}
}

