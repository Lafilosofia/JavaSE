package day03;
/**
 * ɾ�����Ŀ¼
 * ���õݹ�ɾ��
 */
import java.io.File;

public class DeleteMkDirsDemo {
	public static void main(String[] args) {
		//ɾ�����Ŀ¼
		File file = new File("./a");
		
	}
	
	//ɾ���༶Ŀ¼
	private static void  fileDelete(File file) {
		File[] files = file.listFiles();
		for(int i = 0;i < files.length;i ++){
			if (files[i].isFile()) {	//�ж��ǲ����ļ�,������ļ���ɾ��
				files[i].delete();
				System.out.println("ɾ�����ļ���:" + files[i].getName());
			}else if(files[i].isDirectory()){
				fileDelete(files[i]);
			}
		}
		
		file.delete();	//ɾ���հ�Ŀ¼
		System.out.println("ɾ�����!");
	}
}
