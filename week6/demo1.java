/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：奇数求和
*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		int i=0,b=0;
		for(i=0;i<10;i++) {
			int a=nr.nextInt();
			if(a%2!=0) {
				
				b=b+a;
			}
		}
		System.out.printf("%d",b);
	}

}
