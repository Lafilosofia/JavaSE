package day02;

import java.util.Scanner;

public class DemoReg04 {
	public static void main(String[] args) {
		/*
		 * 用户注册
		 * 账号(要求6-12个字符)
		 * 密码(要求6个字符)
		 * 邮箱(满足邮箱格式)
		 * 手机(11位数字)
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		String accout="^\\w{6,12}$";
		String password="^[a-zA-Z_0-9]{6}$";
		String email="^\\w{4,18}@[a-z]+\\.[a-z]{2,3}$";
		String phone="^(\\+86|\\+0086)?\\s*1\\d{10}$";//手机号码以1开头
		System.out.println("用户注册");
		
		System.out.println("请输入账号(要求6-12个字符)");
		String userAccount=scanner.next();
		if(!userAccount.matches(accout)){
			System.out.println("请合法输入账号(要求6-12个字符)");
			return ;
		}
		
		System.out.println("请输入密码(要求6个字符)");
		String userPassword=scanner.next();
		if(!userPassword.matches(password)){
			System.out.println("请合法输入密码(要求6个字符)");
			return ;
		}
		
		System.out.println("请输入邮箱");
		String userEmail=scanner.next();
		if(!userEmail.matches(email)){
			System.out.println("请输入正确的邮箱");
			return ;
		}
		
		System.out.println("请输入电话号码(11位数字,并以1开头)");
		String userPhone=scanner.next();
		if(!userPhone.matches(phone)){
			System.out.println("请输入正确的手机号码(11位数字,并以1开头)");
			return ;
		}
		
		System.out.println("恭喜你,注册成功");
	}
}

