
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=1,p=1;
		while(n!=0)
		{
			r=n%10;
			p=p*r;
			n=n/10;
		}
		  System.out.println(p);
		
		
	}
}
