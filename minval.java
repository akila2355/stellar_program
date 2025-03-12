package com.steller;
import java.util.*;
import java.util.Scanner;
public class minval  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int min=0;
		System.out.println("Enter value: ");
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		min=a[0];
		for(int i=1;i<n;i++){
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value: "+min);
	}
}
