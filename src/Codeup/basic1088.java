package Codeup;

import java.util.Scanner;

//1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
//그때까지의 합을 출력한다.
public class basic1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3 == 0) {
				System.out.print("");
			}else
				System.out.print(i+" ");
		}
	}
}
