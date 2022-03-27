/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：求n以内所有能被3和5整除的正整数
*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		int a=nr.nextInt();
		int j=0;
		if(a>10) {
			for(int i=1;i<=a;i++) {
				if(i%3==0&&i%5==0) {
					j++;
					if(j<=10) {
						System.out.printf("%d ",i);
					}
					if(j==10){
						j=0;
						System.out.printf("\n");
					}
					
				}
				
			}
		}
		
		
	}

}
