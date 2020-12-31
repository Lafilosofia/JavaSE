package day02;

import java.util.Scanner;

/**
 * 案例:利用正则替换用户输入信息中的敏感词
 * @author HP
 *
 */
public class DemoReplaceAll02 {
	public static void main(String[] args) {
		//敏感词
		String message = "我靠|臭不要脸的|卧槽|他妈的|你妈|我贼你妈";
		Scanner scanner = new Scanner(System.in);
		System.out.println("发送消息...");
		String input = scanner.next();
		input = input.replaceAll(message, "**");//把敏感词替换成"**"
		System.out.println(input);
		
	}
}