package Class_Program;

import java.util.Scanner;

public class Sum31_floydtriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		int k=1;
		for(int i=1;i<=1;i++) {
			for(int space=n;space>i;space--)
				System.out.print(" ");	
			for(int j=1;j<=i;j++) {
				System.out.print(k+++ " ");
			}
			System.out.println();
		}
		s.close();
	}

}
