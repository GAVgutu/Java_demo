/*
  请根据实际环境需求来修改，才能正常运行
  来自练习
  自定义题目：购买N张彩票
*/
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner nr=new Scanner(System.in); //创建输入扫描器
		Random r = new Random(); //创建随机生成器
		System.out.println("你要买多少张彩票？请输入数字：");//提示
		int a=nr.nextInt(); //输入
		int i=1,j=1; //两次循环的初始值
		int u=4; //彩票位数
		
		for(i=1;i<=a;i++){
			System.out.println("第"+i+"张彩票"); //提示第几张彩票
			for(j=1;j<=u;j++){
				int ran1 = r.nextInt(10);
			    System.out.printf("%d",ran1); //提示彩票位数
			}
			System.out.println("");//防止并列
		}
		System.out.println("你购买了"+a+"张，不巧的是，你其中一张中奖了，获得无限的钱，反正就是无限的钱");
	}

}
