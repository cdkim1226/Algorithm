package Codeup;

import java.util.Arrays;
import java.util.Scanner;

public class basic1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			Arrays.sort(arr);
		}
		System.out.print(arr[0]);
	}
}