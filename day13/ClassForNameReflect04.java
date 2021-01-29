package day13;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * getDeclaredMethods��getMethods����:
 * 
 * getDeclaredMethods:ֻ��ѯ��ǰ��Class�еķ���;
 * 
 * getMethods:��ѯ��ǰ��Class�еķ����͸����м̳еķ���(˽�з������ɻ�ȡ)
 * @author HP
 *
 */
public class ClassForNameReflect04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String className = scanner.next();
		try {
			Class cls = Class.forName(className);
			//��ȡ��ǰ���е����з���
			Method[] methods = cls.getDeclaredMethods();
			for(Method m : methods){
				System.out.println(m);
			}
			
			//��ȡ��ǰ��͸����е����з���
			Method[] meths = cls.getMethods();
			for(Method m : meths){
				System.out.println("����͸����еķ���:"+m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
