package day03;

import java.io.File;

/**
 * 使用File创建目录
 * @author HP
 *
 */
public class CreateMkdirDemo {
	public static void main(String[] args) {
		//File提供了mkdir()方法,创建目录
		File file = new File("./demo");
		if (!file.exists()) {
			file.mkdir();
			System.out.println("目录已创建!");
		}else {
			System.out.println("目录已存在!");
		}
	}
}
