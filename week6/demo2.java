/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：字母-数字转换 
*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		String a= nr.next();
		int d=0;
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			if(Character.isLetter(b)){
				d=1;
			}else{
				d=0;
				break;
			}
			
		}
		if(d==1) {
			for(int i=0;i<a.length();i++) {
				
				char b=a.charAt(i);
				if(Character.isUpperCase(b)) {
					int c=b-64;
					System.out.printf("%d",c);
				}else {
					int c=b-96;
					System.out.printf("%d",c);
				}
				
				
			}
		}else {
			System.out.printf("Wrong Format");
		}
		
		
	}

}
