package Codeup;

import java.util.Scanner;


//1초 동안 마이크로 소리강약을 체크하는 수를 h
//(헤르쯔, Hz 는 1초에 몇 번? 체크하는가를 의미한다.)
//
//한 번 체크한 결과를 저장하는 비트 b
//(2비트를 사용하면 0 또는 1 두 가지, 16비트를 사용하면 65536가지..)
//
//좌우 등 소리를 저장할 트랙 개수인 채널 c
//(모노는 1개, 스테레오는 2개의 트랙으로 저장함을 의미한다.)
//
//녹음할 시간 s가 주어질 때,
//
//필요한 저장 용량을 계산하는 프로그램을 작성해보자.

public class basic1085_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        double total = 0;
        
           total = h*b*c*s;

        double result = ((total/8)/1024/1024);
        System.out.printf("%.1f MB",result);
	}

}
