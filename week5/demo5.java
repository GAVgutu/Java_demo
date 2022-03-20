/*
  请根据实际环境需求来修改，才能正常运行
  来自题目
  题目：电话键盘字母数字转换 
*/


import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nr=new Scanner(System.in);
		String text=nr.next();
		String a=text.substring(0,1);
		switch(a) {
		case "1":
			break;
		case "A":
		case "B":
		case "C":
		case "a":
		case "b":
		case "c":
			System.out.println(2);
			break;
		case "D":
		case "E":
		case "F":
		case "d":
		case "e":
		case "f":
		
			System.out.println(3);
			break;
		case "G":
		case "H":
		case "I":
		case "g":
		case "h":
		case "i":
			System.out.println(4);
			break;
		case "J":
		case "K":
		case "L":
		case "j":
		case "k":
		case "l":
			System.out.println(5);
			break;
		case "M":
		case "N":
		case "O":
		case "m":
		case "n":
		case "o":
			System.out.println(6);
			break;
		case "P":
		case "Q":
		case "R":
		case "S":
		case "p":
		case "q":
		case "r":
		case "s":
			System.out.println(7);
			break;
		case "T":
		case "U":
		case "V":
		case "t":
		case "u":
		case "v":
			System.out.println(8);
			break;
		case "W":
		case "X":
		case "Y":
		case "Z":
		case "w":
		case "x":
		case "y":
		case "z":
			System.out.println(9);
			break;
		default:
			System.out.println(a+" is an invalid input");
		}
	}

}
