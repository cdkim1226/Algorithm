package Codeup;

import java.util.Scanner;
// 배타적 논리합(xor, 서로 다를 때 1)
// 구체적으로 설명하자면,
// 두 장의 이미지가 겹쳐졌을 때 색이 서로 다른 부분만 처리할 수 있다.
// 배경이 되는 그림과 배경 위에서 움직이는 그림이 있을 때,
// 두 그림에서 차이만 골라내 배경 위에서 움직이는 그림의 색으로 바꿔주면
// 전체 그림을 구성하는 모든 점들의 색을 다시 계산해 입히지 않고
// 보다 효과적으로 그림을 처리할 수 있게 되는 것이다.
// 비행기 슈팅게임 등을 상상해보면 된다.
public class basic1062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
			System.out.println(a^b);
	}
	
}
