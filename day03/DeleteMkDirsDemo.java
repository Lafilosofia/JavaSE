package day03;
/**
 * 删除多个目录
 * 利用递归删除
 */
import java.io.File;

public class DeleteMkDirsDemo {
	public static void main(String[] args) {
		//删除多个目录
		File file = new File("./a");
		
	}
	
	//删除多级目录
	private static void  fileDelete(File file) {
		File[] files = file.listFiles();
		for(int i = 0;i < files.length;i ++){
			if (files[i].isFile()) {	//判断是不是文件,如果是文件则删除
				files[i].delete();
				System.out.println("删除的文件是:" + files[i].getName());
			}else if(files[i].isDirectory()){
				fileDelete(files[i]);
			}
		}
		
		file.delete();	//删除空白目录
		System.out.println("删除完毕!");
	}
}
