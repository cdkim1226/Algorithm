package Codeup;

import java.util.Scanner;

public class basic1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value1 = n/10000;
		int value2 = (n%10000)/1000;
		int value3 = (n%1000)/100;
		int value4 = (n%100)/10;
		int value5 = n%10;
		
		System.out.println("["+value1*10000+"]");
		System.out.println("["+value2*1000+"]");
		System.out.println("["+value3*100+"]");
		System.out.println("["+value4*10+"]");
		System.out.println("["+value5+"]");
		sc.close();
	}
	

}
