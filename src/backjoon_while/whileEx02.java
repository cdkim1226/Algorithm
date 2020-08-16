package backjoon_while;

import java.util.Scanner;

//A+B - 4
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오..

public class whileEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			System.out.println(sum);
		}
		sc.close();
		
	}
}
