package Codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class basic1084_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		String[] b = a.split(" ");
		int count = 0;
		
		for (int i = 0; i < Integer.valueOf(b[0]); i++) {
			for (int j = 0; j < Integer.valueOf(b[1]); j++) {
				for (int k = 0; k < Integer.valueOf(b[2]); k++) {
					bw.write(i + " " + j + " " + k + "\n");
					count++;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
	}
}
