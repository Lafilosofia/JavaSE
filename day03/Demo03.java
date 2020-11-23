package day03;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * switch-case语句是一种特殊的分支结构,可以根据一个整数表达式的不同取值
		 * 从不同的程序入口开始执行
		 * 从JDK7.0开始,switch-case支持字符串表达式
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("请用户点击1-4数字");
		int n=scanner.nextInt();
		switch(n){
			case 1:
				System.out.println("查看账单");
				break;
			case 2:
				System.out.println("充值缴费");
				break;
			case 3:
				System.out.println("业务办理");
				break;
			case 4:
				System.out.println("人工服务");
				break;
			default:
				System.out.println("没有业务请挂断");
		}
	}
}
