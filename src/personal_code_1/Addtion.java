package personal_code_1;

public class Addtion {
	public static void main(String[] args) {
		
	for(int a = 0; a < 10; a++) {
		for(int b = 0; b < 10; b++) {
			if((a+b) == 9) {
				String c = Integer.toString(a);
				String d = Integer.toString(b);
				String sum1 = c + d;
				String sum2 = d + c;
				int i = Integer.parseInt(sum1);
				int j = Integer.parseInt(sum2);
				if(i + j == 99) {
					//System.out.println(sum1 + " + " + sum2 + " = " + (i + j));
					System.out.printf("\n%s + %s = %d", sum1, sum2, (i+j));
				}
				
			}
		}
		
	}
	}
}
