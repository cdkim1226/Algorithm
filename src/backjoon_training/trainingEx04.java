package backjoon_training;

import java.util.Scanner;

// 별 찍기 - 13

public class trainingEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=n; k>=1; k--) {
			for(int l=k; l>1; l--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
