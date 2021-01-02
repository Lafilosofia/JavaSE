package day04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 缓冲流的缓冲区操作
 * 将缓冲流连接在文件流可以提高效率;
 * 缓冲流实际上本质就是进行块读写操作,无论我们使用缓冲流进行何种读写方式,最终
 * 都会被缓冲流转换为块读写形式通过文件流进行实际操作;
 * 
 * 缓冲流内部维护了一个8k的字节流数组,用于块读写操作
 * 
 * BufferedInputStream:输入缓冲流
 * BufferedOutputStream:输出缓冲流
 * 
 * 缓冲流提供了一个强制写出数据的方法:flush();
 * @author 86180
 *
 */
public class Buffer_FlashDemo {
	public static void main(String[] args)throws Exception {
		//文件输出流
		FileOutputStream fos=new FileOutputStream("bos.txt");
		//文件输出缓冲流
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String str="人生最痛苦的就是在不懂爱情的年龄选择了爱情";
		byte[] bytes=str.getBytes("UTF-8");
		bos.write(bytes);
		System.out.println("写入完毕!");
		//bos.flush();//强制将当前缓冲区数据写出
		bos.close();//缓冲流close()时会调用flush();
	}
}
