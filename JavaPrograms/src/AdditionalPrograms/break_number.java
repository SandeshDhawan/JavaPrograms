package AdditionalPrograms;

import java.util.Scanner;

public class break_number {
	public static void main(String[] args) {
		int n,p,rev=0;
		Scanner k=new Scanner(System.in);
		
		System.out.println("Enter Any Number");
		n=k.nextInt();
		
		while(n!=0){
			p=n%10;
			rev=rev*10+p;
			n=n/10;
		}
		
		System.out.println("Reverse is="+rev);
		
		
		System.out.println("Splitted Number is=");
		while(rev!=0){
			p=rev%10;
			System.out.print(p+" ");
			rev=rev/10;
		}
	}
}
