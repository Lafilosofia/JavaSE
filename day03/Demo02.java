package day03;

import java.util.Scanner;

/**
 * 分支结构
 * if(boolean){语句块}
 * boolean如果为true则执行if语句块,相反不执行
 * @author 86180
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		/*int a=5;
		int b=8;*/
		/*if(a>b){
			System.out.println("错的");	
		}
		if(a<b){
			System.out.println("对的");
		}*/
		
		/*
		 *if(boolean){语句块1}else{语句块2} 
		 *boolean类型为true时执行语句块1,否则执行语句块2
		 */
		
		/*if(a>b){
			System.out.println("语句块1");
		}else{
			System.out.println("语句块2");
		}*/
		
		/*
		 * if(){}else if(){}else if(){}...else{}
		 */
		
		/*if(a>b){
			System.out.println("语句块1");
		}else if(a==b){
			System.out.println("语句块2");
		}else if(a<b){
			System.out.println("语句块3");
		}else{
			System.out.println("语句块4");
		}*/
		
		/*
		 * 模拟超市商品打折系统
		 * 购买500(包含500)以上到1000(包含1000)打9折
		 * 1000以上到2000(包含2000)打8.5折
		 * 2000以上打7.5折
		 */
		
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("请输入商品的价格:");
		double price=scanner.nextDouble();
		if(price<=0){
			System.out.println("请合法输入商品价格！");
		}
		System.out.println("请输入商品数量:");
		int count=scanner.nextInt();
		if(count<=0){
			System.out.println("请合法输入商品数量！");
		}
		//计算总价
		double allPrice=price*count;
		//判断折扣
		if(allPrice<500&&allPrice>0){
			System.out.println("不打折,需要支付:"+allPrice);
		}else if(allPrice>=500&&allPrice<=1000){
			System.out.println("打9折,需要支付:"+(allPrice*0.9));
		}else if(allPrice>1000&&allPrice<=2000){
			System.out.println("打8.5折,需要支付:"+(allPrice*0.85));
		}else if(allPrice>2000){
			System.out.println("打7.5折,需要支付:"+(allPrice*0.75));
		}else{
			System.out.println("输入有误！");
		}*/
		
		/*
		 * 课后作业:
		 * 根据学员的成绩输出等级
		 * A:成绩大于等于90分小于等于100分,输出"优秀";
		 * B:成绩小于90分大于等于80分,输出"良好";
		 * C:成绩小于80分大于等于60分,输出"及格";
		 * D:成绩小于60分;输出"不及格";
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入学员的成绩:");
		double score;
		while(true){
			score=scanner.nextDouble();
			if(score<0 || score>100){
				System.out.println("请合法输入成绩！");
			}else{
				break;
			}
		}
		if(score>=90&&score<=100){
			System.out.println("你的成绩是优秀！");
		}else if(score>=80&&score<90){
			System.out.println("你的成绩是良好！");
		}else if(score>=60&&score<80){
			System.out.println("你的成绩是及格！");
		}else{
			System.out.println("你的成绩不合格！");
		}
		
		
	}
}
