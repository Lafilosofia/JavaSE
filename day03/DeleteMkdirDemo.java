package day03;

import java.io.File;

/**
 * ʹ��Fileɾ��Ŀ¼
 * @author HP
 *
 */
public class DeleteMkdirDemo {
	public static void main(String[] args) {
		/*File file = new File("./demo");
		if (file.exists()) {
			file.delete();
			System.out.println("ɾ��Ŀ¼���!");
		}else{
			System.out.println("Ŀ¼������!");
		}
		
		ɾ��Ŀ¼������һ��ǰ��
		����Ŀ¼������һ���հ�Ŀ¼�ſ���ɾ��
		������·�ʽ����ȡ*/
		
		File file = new File("./a/b/c/d/e");
		if (file.exists()) {
			file.delete();
			System.out.println("Ŀ¼ɾ�����!");
		}else {
			System.out.println("Ŀ¼������!");
		}
	}
}
