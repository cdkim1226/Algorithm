package backjoon_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A+B - 4
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오..

public class whileEx02_2 {

	public static void main(String[] args) throws  IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		StringTokenizer st;
		while((str=br.readLine()) != null) {
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		System.out.print(sb+"\n");
	}
}
