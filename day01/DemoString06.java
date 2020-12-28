package day01;
/**
 * 截取字符串
 * substring(起始位置)
 * substring(起始位置/结束位置)
 * 
 * @author HP
 *
 */
public class DemoString06 {
	public static void main(String[] args) {
		String string = "http://ykt.com/index.html";
		/*String类提供了
		 * subString(int beginIndex,int endIndex)
		 * 返回一个字符串
		 * 含头不含尾(含开始的下标,不含结束的下标)*/
		String s = string.substring(0,4);
		System.out.println(s);
		
		//截取str中的域名"ykt.com"
		s = string.substring(7, 14);
		System.out.println(s);
		
		//从7开始连续截4个字符
		s = string.substring(7, 7 + 4);
		
		//截取str中"ykt.com/index.html"
		/*String方法提供了sunstring(int beginIndex)方法
		 * 从起始位置到最后全部截取为子字符串*/
		s = string.substring(3);
		System.out.println(s);
		
		/*
		 * 动态截取URL中主机名
		 * 0123456789...
		 * http://kunge.org/index.html
		 */
		String url="http://kunge.org/index.html";
		int index=url.indexOf("/", 7);
		String host=url.substring(7, index);
		//System.out.println(host);
		
		//动态截取URL中的文件名"index.html"利用substring()和lastIndexOf()
		/*int index2=url.lastIndexOf("/");
		System.out.println(index2);
		String host2=url.substring(index2+1);*/
		String host2=url.substring(url.lastIndexOf("/")+1);
		System.out.println(host2);
	}
}
