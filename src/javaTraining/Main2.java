package javaTraining;
//���� 2920�� ���� ���ϱ� ����
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);	//��ĳ�� �Լ��� �θ���.
        String input=scan.nextLine(); 	//���ڿ��� �޴´�.
        
        String A="1 2 3 4 5 6 7 8";		//���ڿ� "1,2,3,4,5,6,7,8"����
        String D="8 7 6 5 4 3 2 1";		//���ڿ� "8,7,6,5,4,3,2,1"����
        String output=new String();		//���ڿ� ����
    
        if(input.equals(A)){		//if������, ���� ���ڿ� �� A�� ���ڿ��� ������	
            output="ascending";		//"ascending"
        }else if(input.equals(D)){	//�������ڿ� �̰�����
        	output="descending";	// "descending"���
        } else {
            output="mixed";		// �Ѵ� �ƴҽ� "mixed"���
        }

        scan.close();
        System.out.println(output);	//���ڿ����
      
	}

}
