package com.steller;
import java.util.Scanner;
public class Palindrome  {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer str1=new StringBuffer(str).reverse();
		if(str.equals(str1.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
