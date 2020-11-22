package day03;

import java.util.Scanner;

/**
 * byte,char,short转换为int
 * byte,char,short三种类型实际存储的数据都是整数，在实际使用中
 * 遵循如下规则:
 * int直接量可以直接接赋值给byte,char和short,只要不超过其表示范围
 * byte,char和short三种类型参与运算时,先一律转换为int类型再进行运算
 * 
 * byte范围			-128~127				1个字节
 * short范围		-32768~32767			2个字节
 * float范围		-3.403E38~3.403E38		4个字节
 * double范围		-1.798EE308~1.798EE308	8个字节
 * long范围			-9223373036854775808~9223373036854775807	8个字节
 * @author 86180
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		byte a=12;
		byte b=8;
		byte c=(byte)(a+b);
		short a1=12;
		short b1=8;
		short c1=(short)(a1+b1);
		char ch='a';
		char ch2='b';
		short s=(short)(ch+ch2);
		System.out.println(s);
		/*
		 * 定义float类型时，需在数值后加一个"f",如果写的是一个整数不加"f",系统会认为是int类型
		 * 例:int a=5;
		 * 如果写的是一个小数不加"f"，系统则会认为是double类型;
		 */
		float f=0.35f;
		
	}
}
