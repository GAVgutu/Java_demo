/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：找出最大和最小值
*/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		int a=nr.nextInt();
		int[] b=new int[a];
		int i,max=0,min=0;
		for(i=0;i<a;i++) {
			b[i]=nr.nextInt();
		}
		
		for(i=0;i<a;i++) {
			if(b[i]>max) {
				max=b[i];
			}
			if(i==0) {
				min=b[i];
			}else if(min>b[i]) {
				min=b[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
