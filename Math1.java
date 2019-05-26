public class Math1
{
	public void add()
	{
		System.out.println("Sum of 10 and 11="+10+11);
	}
	public void add(int x, int y)
	{
		int sum=x+y;
		//System.out.printf("Sum of %d and %d is %d"+x,y,sum);
		System.out.println(" ");
	}
	public void add(int k, int x, int y)
	{
		int sum= k+y+x;
		System.out.println("Sum of "+k+", "+x+" and "+y+" is:"+sum);
	}
	public static void main(String []a)
	{
		Math1 obj = new Math1();
		obj.add(10,20);
		obj.add(10,20, 11);
	}
}
	