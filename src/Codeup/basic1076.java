package Codeup;

import java.util.Scanner;

public class basic1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char n = sc.nextLine().charAt(0);
		int num = (int)n;
		for(int i=97; i<=num; i++) {
			System.out.print((char)i+" ");
		}
	}
}
