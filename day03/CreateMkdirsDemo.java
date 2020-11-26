package day03;

import java.io.File;

public class CreateMkdirsDemo {
	public static void main(String[] args) {
		//File提供了mkdirs()可创建多个目录
		File file = new File("./a/b/c/d/e");
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("创建目录完毕!");
		}else {
			System.out.println("目录已存在!");
		}
	}
}
