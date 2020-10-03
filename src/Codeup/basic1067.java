package Codeup;

import java.util.Scanner;

public class basic1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a <= 100 && a >= 90) {
			System.out.println("A");
		}else if(a <= 89 && a >= 70 ) {
			System.out.println("B");
		}else if(a <= 69 && a >= 40) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}
}
