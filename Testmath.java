package com.project;
import java.util.Scanner;


public class Testmath {

	public static void main(String[] args) {
		Math Testmath=new Math();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the int values:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Testmath.num1=num1;
		Testmath.num2=num2;
		System.out.println("Add the int values:"+(num1+num2));
		System.out.println("Enter the float values:");
		float num3=sc.nextFloat();
		float num4=sc.nextFloat();
		Testmath.num3=num3;
		Testmath.num4=num4;
		System.out.println("Sub the values:"+(num3-num4+(num1+num2)));
		System.out.println("Enter the long values:");
		long num5=sc.nextLong();
		long num6=sc.nextLong();
		Testmath.num5=num5;
		Testmath.num6=num6;
		System.out.println("Multiply the values:"+(num5*num6));
		
		
		
		
		// TODO Auto-generated method stub

	}

}
