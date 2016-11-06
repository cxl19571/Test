import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		//加载输入
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数");
		int a=input.nextInt(); //a的数值
		int b=0; //用来算出 1,11,111,1111......
		System.out.println("请输入a的个数");
		int num=input.nextInt(); //总共多少个a
		int result=0; //结果
		for (int i = 0; i < num; i++) {
			b=10*b+1;
			System.out.print(b*a+"+");
			result=b*a+result;
		}
		System.out.println("结果:"+result);
	}

}
