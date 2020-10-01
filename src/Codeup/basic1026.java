package Codeup;

import java.util.Scanner;

public class basic1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		int idx = n.indexOf(":");
		
		int ldex = n.lastIndexOf(":");
		
		int min = Integer.parseInt(n.substring(idx+1,ldex));
		
		System.out.printf("%d",min);
		
		sc.close();
	}
	

}
