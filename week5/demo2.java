/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：多路分支之月份天数计算
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner nr=new Scanner(System.in);
		int a =nr.nextInt();
		int b =nr.nextInt();
		if(a%4==0 && a%100!=0 || a%400==0){
			switch(b){
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.println(a+"年"+b+"月有31天");
		        break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.println(a+"年"+b+"月有30天");
		    	break;
		    default:
		    	System.out.println(a+"年"+b+"月有29天");
		    	}
		}else {
			switch(b){
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.println(a+"年"+b+"月有31天");
		        break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.println(a+"年"+b+"月有30天");
		    	break;
		    default:
		    	System.out.println(a+"年"+b+"月有28天");
		}
		}
}
}
