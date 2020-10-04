package Codeup;

import java.util.Scanner;

public class basic1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i=1; i<=n; i++) {
			result += i;
			if(result >= n) {
				System.out.print(i);
				break;
				
			}
		}
	}
}
