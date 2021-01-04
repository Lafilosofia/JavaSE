package day04;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将流按照读写单位划分为字节流与字符流
 * InputStream和OutputStream是所有字节流的父类
 * 而java.io.Reader和java.io.Writer是字符流的父类;
 * 小技巧:以Stream结尾的一般是字节流(也就是低级流),以Reader或Writer结尾的一般是字符流(也就是高级流)
 * 
 * 字符流只是方便我们读写字符,底层本质还是读写字节,只是字节与字符的转换
 * 工作交给了转换流来完成;
 * 
 * 转换流:
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 
 * java提供的其他高级字符流都有一个特点就是只能连接在其他字符流上,
 * 但是通常低级流都是字节流,这就导致字符流不能直接搭配字节流使用,
 * 但是转换流例外,它们本身就是字符流,而它们又可以连接字节流,所以在实际开发中当我们使用高级的字符流
 * 时通常与字节流连接时需要使用转换流,它起到"承上启下"的作用,也就是"将字符转换字节"的功能
 * 
 * @author HP
 *
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws Exception {
		//输出字节流
		FileOutputStream fos = new FileOutputStream("osw.txt");
		//输出转换流
		/*
		 * OutputStreamWirter构造方法OutputStreamWriter(OutputStream out)
		 * InputStreamReader(InputStream in)
		 * 
		 * OutputStreamWriter(OutputStream out,String charset);
		 * InputStreamReader(InputStream in,String charset);
		 * charset:编码格式
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		String str = "终有弱水替沧海";
		osw.write(str);
		osw.write(",再把相思寄巫山");
		System.out.println("写入完毕");
		osw.close();
		
		
	}
}
