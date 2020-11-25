package day03;

import java.io.File;
import java.io.IOException;

/**
 * java.io.File
 * File的每一个实例时用于表示硬盘上的一个文件或者目录.
 * 
 * 使用File可以:
 * 1. 访问其表示的文件或目录的属性信息(名字,大小,等)
 * 2. 操作文件或目录(创建,删除)
 * 3. 访问一个目录中的所有子项但是不能访问文件数据
 * 
 * @author 86180
 *
 */
public class CreateFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 在表示文件或目录时指定的路径尽量不要使用绝对路径,因为不同的操作系统格式不一致.
		 * 
		 * 相对路径是最常用的,但是相对路径相对哪里要看程序在那个运行环境运行,
		 * 运行环境决定着相对路径
		 * 
		 * 在eclipse中运行程序时,"当前目录"指定该类所处的项目目录用"./"表示
		 * 在这里./可以省略不写
		 */
		
		/*
		 * 在当前目录中新建一个文件demo.txt
		 * File提供了createNewFile()方法创建文件
		 */
		File file=new File("./demo.txt");
		/*
		 *File 提供了boolean exists()该方法是用于判断当前File表示的文件或目录是否存在
		 * ,存在则返回true
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件已创建!");
		}else{
			System.out.println("文件已存在!");
		}
		
	}
}
