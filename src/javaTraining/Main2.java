package javaTraining;
//���� 2920�� ���� ���ϱ� ����
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	//��ĳ�� �Լ��� �θ���.
        int[] array= new int[8];	//8��¥���� ������ ���� �迭�������.
        
        for (int i = 0; i < array.length; i++) {	// �迭�� 8���� ���� �Է¹޾� �ֽ��ϴ�.
        	array[i] = scan.nextInt();
        }
        
        String output=new String();
        for (int i=0;i<array.length-1;i++){		//�ݺ��� ����
            if(array[i]==array[i+1]-1){		//if������,	�迭�� ������ 1�� ������ ������� �迭�� ���� ���ƾ� �Ѵ�.
                output="ascending";		//������� �ԷµǾ����� "ascending"���
            }else if(array[i]==array[i+1]+1){	//�迭�� ������ 1�� �������� ������� �迭�� ���� ���ƾ� �Ѵ�.
                output ="descending";	//������� �Է� �Ǿ����� "descending"���
            } else {
                output = "mixed";		// �Ѵ� �ƴҽ� "mixed"���
                break;					//if�� �ߴ�
            }
        }		//�ݺ��� ����
        System.out.println(output);
      
	}

}
