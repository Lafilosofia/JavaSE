package day02;

import java.util.Scanner;

/**
 * ����:���������滻�û�������Ϣ�е����д�
 * @author HP
 *
 */
public class DemoReplaceAll02 {
	public static void main(String[] args) {
		//���д�
		String message = "�ҿ�|����Ҫ����|�Բ�|�����|����|��������";
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ϣ...");
		String input = scanner.next();
		input = input.replaceAll(message, "**");//�����д��滻��"**"
		System.out.println(input);
		
	}
}