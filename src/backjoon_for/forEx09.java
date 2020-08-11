package backjoon_for;

//별 찍기 - 1
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class forEx09 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		int n = Integer.parseInt(br.readLine());
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
//			첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
			bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();

	}
}
