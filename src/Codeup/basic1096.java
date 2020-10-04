package Codeup;

import java.util.Scanner;

public class basic1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 몇번의 좌표를 입력할건지 
		
		int a[][] = new int[19][19]; // 2차원 배열 19*19 
		
		for(int i=0; i<n; i++) { // n번 동안 
			int inputx = sc.nextInt(); // x값 입력받기
			int inputy = sc.nextInt(); // y값 입력받기
			
			for(int x=0; x<a.length; x++) {
				for(int y=0; y<a.length; y++) {
					a[inputx-1][inputy-1] = 1;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}