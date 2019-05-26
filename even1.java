 public class Even1
{
	int neven, nodd;
	public void count()
	{
	for(int i=1; i<=50; i++)
	{
	if(i%2==0)
	{
	neven=neven+1;
	}
	else
	{
	nodd=nodd+1;
	}
	}
	System.out.println("neven"+neven);
	System.out.println("nodd"+nodd);}
	public static void main(String []a)
	{
	Even1 obj=new Even1();
	obj.count();
	}
}