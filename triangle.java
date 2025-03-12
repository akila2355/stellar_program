package com.steller;
import java.util.*;
import java.util.Scanner;
public class low triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int matrix[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				sum=sum+matrix[i][j];
			}
		}
		System.out.println("Sum of lower triangle: "+sum);
	}
}
