import java.io.*;
public class Palindrome
{
	public static void main(String args[])
	{
		int number=0;
		int n;
		int reversednumber=0;
		int temp=0;
		System.out.println("Enter the number");
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			number=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException ne)
		{
			System.out.println("invalid value:" + ne);
			System.exit(0);
		}
		catch(IOException ioe)
		{
			System.out.println("io error:" + ioe);
			System.exit(0);
		}
		n=number;
		System.out.println("Number is:"+number);
		while(n>0)
		{
			temp=n%10;
			n=n/10;
			reversednumber=reversednumber*10+temp;
		}
		if(number==reversednumber)
		{
			System.out.println("It is Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
	}
}