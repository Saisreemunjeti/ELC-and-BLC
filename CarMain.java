package com.elc.blc;

public class CarMain {

		public static void main(String[] args) {
			Car obj=new Car();
			obj.setCarDetails("Swift", "Maruti", 765000.0);
			String res=obj.getCarDetails();
			System.out.println(res);
			

		}


	}

