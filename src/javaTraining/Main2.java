package javaTraining;
//백준 2920번 음계 구하기 문제
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	//스캐너 함수를 부른다.
        int[] array= new int[8];	//8개짜리의 정수가 들어가는 배열을만든다.
        
        for (int i = 0; i < array.length; i++) {	// 배열에 8개의 수를 입력받아 넣습니다.
        	array[i] = scan.nextInt();
        }
        
      
	}

}
