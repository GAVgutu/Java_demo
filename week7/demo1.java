/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：求出斐波那契数列的第n项
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		int a=nr.nextInt();
		int i,sum=0,b=0,c=1;
		for(i=1;i<a;i++) {
			sum=b+c;
			b=c;
			c=sum;
		}
		System.out.println(sum);
	}

}
