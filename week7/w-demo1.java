/*
  请根据实际环境需求来修改，才能正常运行
  来自练习
  自定义题目：在购物车中有 5 件商品
*/
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("请输入5件商品的价格：");
		int a=0,b=0;
		for(int i=0;i<5;i++){
			arr[i]=nr.nextInt();
			//System.out.print(arr[i]);
		}
		for(int i=0;i<5;i++){
			int sum=arr[i];
			if(sum>a){
				a=sum;
			}
			b=sum+b;
		}
		System.out.println("最高价格："+a);
		System.out.println("总价格："+b);
		System.out.println("平均价格："+b/5.0);
		System.out.printf("排序前的价格：");
		for(int i=0;i<5;i++){
			System.out.printf("%d ",arr[i]);
		}
		Arrays.sort(arr);
		System.out.printf("\n排序后的价格：");
		for(int i=0;i<5;i++){
			System.out.printf("%d ",arr[i]);
		}
	}

}
