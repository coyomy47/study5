package javaTraining;
//���� 2562�� �ִ� ���ϱ� ����

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("����!");
		Scanner scan = new Scanner(System.in);// ��ĳ�� �Լ��� �θ���.
		int [] array = new int[9];// 9��¥�� ���������� �迭�� �����.			
		

		for(int i=0;i<array.length;i++) {			// �迭�� 9���� ���� �Է¹޾� �ֽ��ϴ�.
			array[i]=scan.nextInt();	
		}
		
		int max = array[0];			// ������ �� ù�� ° ���� max�� ���� 
		int index = 0;			// �ִ밪�� ��ġ�� �˾Ƴ� ���� ����
		
		for(int i=1;i<array.length;i++){
			if(array[i] > max) 			// max�� array[0]�̹Ƿ�, max���� ū ���� ������ �� ���� max�� �ȴ�.
			{						
				max = array[i];
				index = i+1;	// max�� �� ���� ��ġ�� index�� �����մϴ�.
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}

}
