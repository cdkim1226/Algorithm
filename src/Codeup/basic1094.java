package Codeup;

import java.util.Scanner;

public class basic1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 10번 불렀을 때
		
		int[] arr = new int[n]; // 학생 수만큼의 배열
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		try {
			
			for(int i=0; i<arr.length; i++) {
				n--;
				System.out.print(arr[n]+" ");
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
		}
		sc.close();
	}
}