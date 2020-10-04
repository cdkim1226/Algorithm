package Codeup;

import java.util.Scanner;

// 등비수열. 시작값,등차값,n번째 수 입력받아 n번째 값 출력하기
public class basic1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
	
		for(int i=1; i<=n; i++) {
			result = a;
			a *= d;
		}
		System.out.println(result);
	}
}
