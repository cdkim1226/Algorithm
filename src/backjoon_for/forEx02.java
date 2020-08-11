package backjoon_for;

import java.util.Scanner;

public class forEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a =0,b = 0;
		int count = sc.nextInt();
		for(int i=1; i<=count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
		

	}
}
