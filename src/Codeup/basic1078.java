package Codeup;

import java.util.Scanner;

public class basic1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) {
				result += i;
			}
		}
		System.out.println(result);
	}
}
