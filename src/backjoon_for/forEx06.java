package backjoon_for;

//기찍  N
//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class forEx06 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		int n = Integer.parseInt(br.readLine());
		//첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		for(int i=n; i>0; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
	}
}
