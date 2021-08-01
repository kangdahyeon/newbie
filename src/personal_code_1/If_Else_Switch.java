package personal_code_1;

import java.util.Scanner;

public class If_Else_Switch {
	public static void main(String[] args) {
		int n = 24;
		Scanner scanner = new Scanner(System.in);
		int scan = Integer.parseInt(scanner.nextLine());
		
		
//		if(n >=0 && n < 10) {
//			System.out.println("0이상 10 미만의 수");
//		} else if (n >=10 && n < 20) {
//			System.out.println("10이상 20 미만의 수");
//		} else if(n >= 20 && n < 30) {
//			System.out.println("20이상 30미만의 수");
//		} else {
//			System.out.println("음수 혹은 30 이상의 수");
//		}
		int num = scan / 10;
		switch (num) {
		case 0 :
			System.out.println("0이상 10 미만의 수");
			break;
		case 1 :
			System.out.println("10이상 20 미만의 수");
			break;
		case 2 :
			System.out.println("20이상 30미만의 수");
			break;
		default :
			System.out.println("음수 혹은 30 이상의 수");
		}
	}

}
