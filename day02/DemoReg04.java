package day02;

import java.util.Scanner;

public class DemoReg04 {
	public static void main(String[] args) {
		/*
		 * �û�ע��
		 * �˺�(Ҫ��6-12���ַ�)
		 * ����(Ҫ��6���ַ�)
		 * ����(���������ʽ)
		 * �ֻ�(11λ����)
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		String accout="^\\w{6,12}$";
		String password="^[a-zA-Z_0-9]{6}$";
		String email="^\\w{4,18}@[a-z]+\\.[a-z]{2,3}$";
		String phone="^(\\+86|\\+0086)?\\s*1\\d{10}$";//�ֻ�������1��ͷ
		System.out.println("�û�ע��");
		
		System.out.println("�������˺�(Ҫ��6-12���ַ�)");
		String userAccount=scanner.next();
		if(!userAccount.matches(accout)){
			System.out.println("��Ϸ������˺�(Ҫ��6-12���ַ�)");
			return ;
		}
		
		System.out.println("����������(Ҫ��6���ַ�)");
		String userPassword=scanner.next();
		if(!userPassword.matches(password)){
			System.out.println("��Ϸ���������(Ҫ��6���ַ�)");
			return ;
		}
		
		System.out.println("����������");
		String userEmail=scanner.next();
		if(!userEmail.matches(email)){
			System.out.println("��������ȷ������");
			return ;
		}
		
		System.out.println("������绰����(11λ����,����1��ͷ)");
		String userPhone=scanner.next();
		if(!userPhone.matches(phone)){
			System.out.println("��������ȷ���ֻ�����(11λ����,����1��ͷ)");
			return ;
		}
		
		System.out.println("��ϲ��,ע��ɹ�");
	}
}

