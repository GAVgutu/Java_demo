/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：输出九九乘法表
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=9;i++) {
			
			for(j=1;j<=9;j++) {
				System.out.printf("%d*%d=%-3d ",i,j,j*i);
			}
			System.out.printf("\n");
		}
	}

}
