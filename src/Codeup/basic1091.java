package Codeup;

import java.util.Scanner;

//  시작값,등차값,n번째 수 입력받아 n번째 값 출력하기
public class basic1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();
		long result = 0;
	
		for(int i=1; i<=n; i++) {
			result = a;
			a = (a*m)+d;
		}
		System.out.println(result);
	}
}