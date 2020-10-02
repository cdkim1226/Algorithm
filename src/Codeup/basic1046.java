package Codeup;

import java.util.Scanner;

public class basic1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int add = a+b+c;
		float avg = (float)add/3;
		System.out.println(add);
		System.out.printf("%.1f",avg);
	}
	

}
