package com.elc.blc;

public class BookMain {

	public static void main(String[] args) {
		Book obj=new Book();
		obj.setBookDetails("Java Basics", "John Doe", 474.7);
		String res=obj.getStudentDetails();
		System.out.println(res);

	}

}
