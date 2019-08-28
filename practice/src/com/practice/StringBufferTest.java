package com.practice;

public class StringBufferTest {

	public static void main1(String[] args) {
		
		StringBuffer sb = new StringBuffer("Sai");
		sb.append("krish");
		System.out.println(sb);
		
	}
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("hai");
		StringBuffer sb2 = new StringBuffer("hello");
		
		//System.out.println(sb1 == sb2);
		
		System.out.println(sb1.equals(sb2));
	}
}
