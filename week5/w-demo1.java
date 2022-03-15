/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：计算个人所得税
  说明：计算条件仅供参考
*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		double a=nr.nextDouble();
		if(a<=3500){
			System.out.printf(";不需要交税";);
		}else if(a>3500 || a<=5000){
			System.out.println(";需要交税：";+(a-3500)*0.03);
		}else if(a>5000 || a<=8000){
			System.out.println(";需要交税：";+(a-5000)*0.1+1500*0.03);
		}else if(a>8000 || a<=12500){
			System.out.println(";需要交税：";+(a-8000)*0.2+3000*0.1+1500*0.03);
		}else if(a>12500 || a<=15000){
			System.out.println(";需要交税：";+(a-12500)*0.25+4500*0.2+3000*0.1+1500*0.03);
		}else if(a>15000){
			System.out.println(";需要交税：";+(a-15000)*0.3+2500*0.25+4500*0.2+3000*0.1+1500*0.03);
		}
	}

}
 
