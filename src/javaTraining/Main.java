package javaTraining;
//백준 2562번 최댓값 구하기 문제

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("시작!");
		Scanner scan = new Scanner(System.in);// 스캐너 함수를 부른다.
		int [] array = new int[9];// 9개짜리 정수가들어가는 배열을 만든다.			
		

		for(int i=0;i<array.length;i++) {			// 배열에 9개의 수를 입력받아 넣습니다.
			array[i]=scan.nextInt();	
		}
		
		int max = array[0];			// 기준이 될 첫번 째 값을 max에 넣음 
		int index = 0;			// 최대값의 위치를 알아낼 변수 생성
		
		for(int i=1;i<array.length;i++){
			if(array[i] > max) 			// max는 array[0]이므로, max보다 큰 값이 있으면 그 값이 max가 된다.
			{						
				max = array[i];
				index = i+1;	// max가 된 값의 위치를 index에 저장합니다.
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}

}
