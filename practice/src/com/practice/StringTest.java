package com.practice;

public class StringTest {
	public static void main(String[] args) {
	}

	public static void main6(String[] args) {

		String s = new String("Sai");
		s.concat("krishna");

		System.out.println(s);

	}

	public static void main2(String[] args) {

		String s = "hai";
		s.concat("hello");
		System.out.println(s);
	}

	public static void main3(String[] args) {

		String s = new String("sai");
		s = s.concat("krish");
		System.out.println(s);
	}

	public static void main4(String[] args) {

		String s = "hai";
		s = "hello";
		System.out.println(s);

	}

	public static void main5(String[] args) {

		
		String s1 = "hai";
		String s2 = "hello";
		String s3 = new String("hai");

		System.out.println(s1 == s3);
		
	}
	
	public static void main7(String[] args) {
		
		String s1 = new String("hai");
		       s1 = "hello";
		       System.out.println(s1);
		
		
	}
	
	
	
	
	
}
