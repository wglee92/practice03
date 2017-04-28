package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		while( true ) { 
			System.out.print(">>");
			input = scanner.nextLine();
			String[] str = input.split(" ");

			if (str[1] == "+")
				Add cal = new Add();
			else if (str[1] == "-")
				Sub cal = new Sub();
			else if (str[1] == "/")
				Div cal = new Div();
			else if (str[1] == "*")
				Mul cal = new Mul();
			cal.setValue(Integer.parseInt(str[1]), Integer.parseInt(str[3]));
			cal.calculator();
			/*  코드를 완성 합니다. */
			break;
		}
		
		scanner.close();
	}
}
