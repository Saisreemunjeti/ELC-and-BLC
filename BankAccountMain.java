package com.elc.blc;

public class BankAccountMain {

		public static void main(String[] args) {
			BankAccount obj=new BankAccount();
			obj.setAccountDetails("Rahul", 123456, 7400.0);
			String res=obj.getAccountDetails();
			System.out.println(res);
			

		}
}
