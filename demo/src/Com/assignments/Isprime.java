package Com.assignments;

import java.util.Scanner;

public class Isprime {
	
	static boolean isprime(int n)
	{
		int m=n/2;
		
		if(n==0 || n==1)
			return false;
		for(int i=2;i<=m;i++)
		{if(n%i==0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner st=new Scanner(System.in);
		
		System.out.println("enter number...");
		int n=st.nextInt();
		
		if(isprime(n))
		{
	       System.out.println(n+" number is prime");
		}
		else
		{
			System.out.println(n+" number is not prime");
		}
		
	}

}
