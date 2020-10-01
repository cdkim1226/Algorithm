package Codeup;

import java.util.Scanner;

public class basic1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		int hex = Integer.parseInt(n,16);
		String result = Integer.toOctalString(hex);
		
		System.out.print(result);
	}
	

}
