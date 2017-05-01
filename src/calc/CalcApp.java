package calc;


import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) { 
			System.out.print(">> ");
			String input = scanner.nextLine();
			if (input.equals("quit"))
				break;
			
			String[] str = input.split(" ");
			
			Arith cal = null;

			switch(str[1]) {
			case "+": {
				cal = new Add();
				break;
			}
			case "-": {
				cal = new Sub();
				break;
			}
			case "/": {
				cal = new Div();
				break;
			}
			case "*": {
				cal = new Mul();
				break;
			}
			default : {
				break;
			}
			}
			
			if (str[1] == null) {
				System.out.println(">>지원 안하는 연산");
				continue;
			}
			
			
			cal.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
			System.out.println(">> " + cal.calculate());
			/*  코드를 완성 합니다. */
		}
	}
}
