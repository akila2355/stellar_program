import java.util.Scanner;

public class TwoSummin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size:");
		int size=s.nextInt();
		int arr[]=new int[size];
		int i=0;
		int min=0;
		for( i=0;i<size;i++) {
			System.out.print("Enter element:");
			arr[i]=s.nextInt();
		}
		for(i=0;i<size;i++) {
			for(int j=i+1;j<size;j++)
			if(arr[i]>=arr[j])
				min=arr[j];
			}
		System.out.print("Minimum number:"+min);
		}
	}
