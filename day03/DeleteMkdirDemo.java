package day03;

import java.io.File;

/**
 * 使用File删除目录
 * @author HP
 *
 */
public class DeleteMkdirDemo {
	public static void main(String[] args) {
		/*File file = new File("./demo");
		if (file.exists()) {
			file.delete();
			System.out.println("删除目录完毕!");
		}else{
			System.out.println("目录不存在!");
		}
		
		删除目录必须有一个前提
		即该目录必须是一个空白目录才可以删除
		因此以下方式不可取*/
		
		File file = new File("./a/b/c/d/e");
		if (file.exists()) {
			file.delete();
			System.out.println("目录删除完毕!");
		}else {
			System.out.println("目录不存在!");
		}
	}
}
