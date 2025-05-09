package com.elc.blc;

public class StudentMain {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setStudentDetails("Saisree", 123, 82.3);
		String res=obj.getStudentDetails();
		System.out.println(res);

	}

}
