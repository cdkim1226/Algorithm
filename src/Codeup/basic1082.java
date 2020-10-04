package Codeup;

import java.util.Scanner;

public class basic1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int num = Integer.parseInt(a,16);
		for(int i=1; i<16; i++) {
			System.out.printf("%X*%X=%X%n",num,i,num*i);
		}
		
	}
}
