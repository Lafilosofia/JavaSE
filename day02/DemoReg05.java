package day02;

import java.util.Arrays;

public class DemoReg05 {
	public static void main(String[] args) {
		/*
		 * split()·Ö¸ô×Ö·û´®
		 */
		String str="java  cpp php   c#";
		String[] s=str.split("\\s+");
		System.out.println(Arrays.toString(s));
		
		String line="100+200-160=140";
		String[] ss=line.split("\\+|\\-|\\=");
		System.out.println(Arrays.toString(ss));
	}
}