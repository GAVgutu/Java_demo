/*
  请根据实际环境需求来修改，才能正常运行
  题目来自pt
  题目：asdut-sel-2 汽车超速罚款（选择结构）
*/

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner nr=new Scanner(System.in);
   int a =nr.nextInt();
   int b =nr.nextInt();
   if(a>=b) {
    System.out.println("Congratulations, you are within the speed limit!");
   }else {
    int c=b-a;
    if(c>=1&&c<=20) {
     System.out.println("You are speeding and your fine is 100.");
     //System.out.println(c); //测试
    }else if(c>=21&&c<=30) {
     System.out.println("You are speeding and your fine is 270.");
     
    }else {
     System.out.println("You are speeding and your fine is 500.");
    
    }
    
   }
 }

}
