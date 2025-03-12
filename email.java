package com.steller;
import java.util.Scanner;
public class email {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
			if(str.contains("com")|| str.contains("in")||str.contains("net")) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invaild");
			}
	}	
}
