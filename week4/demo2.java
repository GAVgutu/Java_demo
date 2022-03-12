/*
  请根据实际环境需求来修改，才能正常运行
  题目来自pt
  题目：判断润年
*/

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner nr=new Scanner(System.in);
  int a =nr.nextInt();
  if(a%4==0 && a%100!=0 || a%400==0){
   System.out.printf("%d是闰年",a);
  }else{
   System.out.printf("%d不是闰年",a);
  }
 }

}
