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
        
        String output=new String();
        for (int i=0;i<array.length-1;i++){		//반복문 시작
            if(array[i]==array[i+1]-1){		//if문시작,	배열의 값에서 1을 뺐을때 순서대로 배열의 값이 같아야 한다.
                output="ascending";		//순서대로 입력되었을시 "ascending"출력
            }else if(array[i]==array[i+1]+1){	//배열의 값에서 1을 더했을때 순서대로 배열의 값이 같아야 한다.
                output ="descending";	//순서대로 입력 되었을시 "descending"출력
            } else {
                output = "mixed";		// 둘다 아닐시 "mixed"출력
                break;					//if문 중단
            }
        }		//반복문 종료
        System.out.println(output);
      
	}

}
