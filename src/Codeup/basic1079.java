package Codeup;

import java.util.Scanner;

public class basic1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			char n = sc.next().charAt(0);
				if(n == 'q') {
					System.out.println(n);
					break;
				}
				System.out.println(n);
			}
	}
}
