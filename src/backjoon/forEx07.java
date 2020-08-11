package backjoon;

//A+B - 7
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class forEx07 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		for(int i=1; i<=n; i++) {
//			int a = Integer.parseInt(br.readLine());
//			int b = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a+b;
			bw.write("Case #"+i+": "+sum+"\n");
		}
		bw.flush();
	}
}
