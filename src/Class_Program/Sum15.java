package Class_Program;

import java.util.Scanner;

public class Sum15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the total number of generation: ");
		int n=s.nextInt();
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
		for(int j=3;j<=n;j++) {
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
		s.close();
					
		
		
				
		
		
		

	}

}
