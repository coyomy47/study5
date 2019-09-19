package javaTraining;
//백준 2920번 음계 구하기 문제
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);	//스캐너 함수를 부른다.
        String input=scan.nextLine(); 	//문자열을 받는다.
        
        String A="1 2 3 4 5 6 7 8";		//문자열 "1,2,3,4,5,6,7,8"생성
        String D="8 7 6 5 4 3 2 1";		//문자열 "8,7,6,5,4,3,2,1"생성
        String output=new String();		//문자열 생성
    
        if(input.equals(A)){		//if문시작, 받은 문자열 과 A의 문자열이 같으면	
            output="ascending";		//"ascending"
        }else if(input.equals(D)){	//받은문자열 이같으면
        	output="descending";	// "descending"출력
        } else {
            output="mixed";		// 둘다 아닐시 "mixed"출력
        }

        scan.close();
        System.out.println(output);	//문자열출력
      
	}

}
