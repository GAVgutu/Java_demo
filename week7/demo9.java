/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目： 谁是第一名 
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		int a=nr.nextInt();
		int max=0,d=0;
		int[] b=new int[a];
		String[] c=new String[a];
		int i;
		for(i=0;i<a;i++) {
			b[i]=nr.nextInt();
			c[i]=nr.next();
			
		}
		for(i=0;i<a;i++) {
			if(b[i]>max) {
				max=b[i];
				d=i;
			}
		}
		System.out.printf("%s",c[d]);
	}

}
