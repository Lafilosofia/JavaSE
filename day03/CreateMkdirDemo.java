package day03;

import java.io.File;

/**
 * ʹ��File����Ŀ¼
 * @author HP
 *
 */
public class CreateMkdirDemo {
	public static void main(String[] args) {
		//File�ṩ��mkdir()����,����Ŀ¼
		File file = new File("./demo");
		if (!file.exists()) {
			file.mkdir();
			System.out.println("Ŀ¼�Ѵ���!");
		}else {
			System.out.println("Ŀ¼�Ѵ���!");
		}
	}
}
