package day03;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author HP
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*����ǰ�ļ��е�demo.txtɾ��
		 * File�ṩ��delete();*/
		File file = new File("./demo.txt");
		if (!file.exists()) {
			System.out.println("�ļ�������!");
		}else {
			file.delete();
			System.out.println("ɾ�����!");
		}
	}
}
