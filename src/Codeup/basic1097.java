package Codeup;

import java.util.Scanner;

public class basic1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[19][19];
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			// left
			for(int n1=y-1; n1>=0; n1--) {
				if(arr[x][n1] == 1) {
					arr[x][n1] = 0;
				}else {
					arr[x][n1] = 1;
				}
			}
			
			// right
			for(int n2=y+1; n2<19; n2++) {
				if(arr[x][n2] == 1) {
					arr[x][n2] = 0;
				}else {
					arr[x][n2] = 1;
				}
			}
			
			// up
			for(int n3=x-1; n3>=0; n3--) {
				if(arr[n3][y] == 1) {
					arr[n3][y] = 0;
				}else {
					arr[n3][y] = 1;
				}
			}
			
			// down
			for(int n4=x+1; n4<19; n4++) {
				if(arr[n4][y] == 1) {
					arr[n4][y] = 0;
				}else {
					arr[n4][y] = 1;
				}
			}
			
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}