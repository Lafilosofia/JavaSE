package day03;

import java.io.File;

public class CreateMkdirsDemo {
	public static void main(String[] args) {
		//File�ṩ��mkdirs()�ɴ������Ŀ¼
		File file = new File("./a/b/c/d/e");
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("����Ŀ¼���!");
		}else {
			System.out.println("Ŀ¼�Ѵ���!");
		}
	}
}
