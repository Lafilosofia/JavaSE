package day03;

import java.io.File;

/**
 * 删除一个文件
 * @author HP
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*将当前文件中的demo.txt删除
		 * File提供了delete();*/
		File file = new File("./demo.txt");
		if (!file.exists()) {
			System.out.println("文件不存在!");
		}else {
			file.delete();
			System.out.println("删除完毕!");
		}
	}
}
