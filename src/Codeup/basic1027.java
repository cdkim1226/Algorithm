package Codeup;

import java.util.Scanner;

public class basic1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		int idx1 = n.indexOf(".");
		int idx2 = n.lastIndexOf(".");
		
		int yy = Integer.parseInt(n.substring(0,idx1));
		int mm = Integer.parseInt(n.substring(idx1+1,idx2));
		int dd = Integer.parseInt(n.substring(idx2+1));
		System.out.printf("%02d-%02d-%04d",dd,mm,yy);
		sc.close();
	}
	

}
