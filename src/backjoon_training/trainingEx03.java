package backjoon_training;

import java.util.Arrays;
import java.util.Scanner;

// 세 수
// 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
public class trainingEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		Arrays.sort(arr);
		System.out.println(arr[1]);
		
	}
}
