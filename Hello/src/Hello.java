import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		//��������
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����");
		int a=input.nextInt(); //a����ֵ
		int b=0; //������� 1,11,111,1111......
		System.out.println("������a�ĸ���");
		int num=input.nextInt(); //�ܹ����ٸ�a
		int result=0; //���
		for (int i = 0; i < num; i++) {
			b=10*b+1;
			System.out.print(b*a+"+");
			result=b*a+result;
		}
		System.out.println("���:"+result);
	}

}
