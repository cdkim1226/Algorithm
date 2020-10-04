package Codeup;

import java.util.Scanner;

public class basic1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 10번 불렀을 때
		
		int[] arr = new int[23]; // 학생 수만큼의 배열
		
		int num = 0; // 부를 학생 번호
		
		for(int i=0; i<n; i++) {
			num = sc.nextInt();
			arr[num-1] += 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}