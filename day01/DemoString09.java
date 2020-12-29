package day01;
/**
 * String类提供了split()
 * split(String str) str是分割符返回一个字符串数组
 * @author HP
 *
 */
public class DemoString09 {
	public static void main(String[] args) {
		String str="你好,益康特,我在这里学习,java";
		String[] strArr=str.split(",");
		System.out.println(strArr.length);
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
	}
}
