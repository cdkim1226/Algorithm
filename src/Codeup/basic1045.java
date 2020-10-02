package Codeup;

import java.util.Scanner;

public class basic1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int add = a+b;
		int minus = a-b;
		int multiply = a*b;
		int division = a/b;
		int left = a%b;
		float divisionf = (float)a/b;
		System.out.println(add);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(division);
		System.out.println(left);
		System.out.printf("%.2f",divisionf);
	}
	

}
