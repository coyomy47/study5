package javaTraining;
//���� 2920�� ���� ���ϱ� ����
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);	//��ĳ�� �Լ��� �θ���.
        
        
        String A="1 2 3 4 5 6 7 8";		//���ڿ� "12345678"����
        String D="8 7 6 5 4 3 2 1";		//���ڿ� "87654321"����
       
        String input=scan.nextLine(); 	//���ڿ��� �޴´�.
        if(input.equals(A)){		//if������, ���� ���ڿ� �� A�� ���ڿ��� ������	
        	System.out.println("ascending");		//"ascending"
        }else if(input.equals(D)){	//�������ڿ� �̰�����
        	System.out.println("descending");;	// "descending"���
        } else {
        	System.out.println("mixed");;		// �Ѵ� �ƴҽ� "mixed"���
        }

        scan.close();
        
      
	}

}
