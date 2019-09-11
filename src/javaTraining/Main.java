package javaTraining;
//백준 2562번 최댓값 구하기 문제

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("9개의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);// 스캐너 함수를 부르나.
		int [] array = new int[9];// 9개짜리 정수가들어가는 배열을 만든다.			
		
		for(int i=0 ;i<array.length;i ++){
			array[i]=sc.nextInt();	
		}// 배열에 9개의 숫자를 입력 받는다.
		
	}

}
