/*
  请根据实际环境需求来修改，才能正常运行
  题目来自pt
  题目：银行智能取款
*/

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner nr=new Scanner(System.in);
  //int a =nr.nextInt();
  float a =nr.nextFloat();
  float b =6000;
  if(a>b){
   System.out.printf("取款失败，您的账户余额不足！");
  }else if(a<0) {
   System.out.printf("您的取款金额输入错误！");
  }else{
   float c=b-a;
   System.out.printf("您已成功取出：%.1f元\n您的余额为：%.1f元",a,c);
  }
 }

}
