package personal_code_1;

import java.util.Scanner;

public class If_Else_Switch {
	public static void main(String[] args) {
		int n = 24;
		Scanner scanner = new Scanner(System.in);
		int scan = Integer.parseInt(scanner.nextLine());
		
		
//		if(n >=0 && n < 10) {
//			System.out.println("0�̻� 10 �̸��� ��");
//		} else if (n >=10 && n < 20) {
//			System.out.println("10�̻� 20 �̸��� ��");
//		} else if(n >= 20 && n < 30) {
//			System.out.println("20�̻� 30�̸��� ��");
//		} else {
//			System.out.println("���� Ȥ�� 30 �̻��� ��");
//		}
		int num = scan / 10;
		switch (num) {
		case 0 :
			System.out.println("0�̻� 10 �̸��� ��");
			break;
		case 1 :
			System.out.println("10�̻� 20 �̸��� ��");
			break;
		case 2 :
			System.out.println("20�̻� 30�̸��� ��");
			break;
		default :
			System.out.println("���� Ȥ�� 30 �̻��� ��");
		}
	}

}
