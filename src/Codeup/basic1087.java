package Codeup;

import java.util.Scanner;

//1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
//그때까지의 합을 출력한다.
public class basic1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum += i;
			if(sum >= n) {
				System.out.println(sum);
				break;
			}
		}
	}
}
