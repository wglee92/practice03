package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 상품 정보 담을 배열 생성
		Goods[] goods = new Goods[COUNT_GOODS];
		
		for (int i=0; i<goods.length; i++) {
			String info = scanner.nextLine();
			String[] tokens = info.split(" ");
			Goods gd = new Goods();
			
			gd.setName(tokens[0]);
			gd.setPrice(Integer.parseInt( tokens[1] ));
			gd.setCountStock(Integer.parseInt( tokens[2] ));
			
			goods[i]=gd;
		}
		
		//상품 정보 출력
		for ( Goods g : goods ) {
			System.out.println(g.getName() + "(가격:" + g.getPrice() + "원)이 " + g.getCountStock() + "개 입고 되었습니다.");
		}
		
		// 자원정리

	}
}
