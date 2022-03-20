/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：游戏角色选择
*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		int a =nr.nextInt();
		int b =nr.nextInt();
		if(a<=4&&b<=3) {
			String name="空";
			String name1="空";
			switch(a){
			case 1:
				name="人类";
				break;
			case 2:
				name="精灵";
				break;
				
			case 3:
				name="兽人";
				break;
			case 4:
				name="暗精灵";
				break;
			}
			switch(b){
			case 1:
				name1="战士";
				break;
			case 2:
				name1="法师";
				break;
			case 3:
				name1="射手";;
				break;
			}
			System.out.print(name+" "+name1);
		}else {
			System.out.print("Wrong Format");
		}
	}

}
