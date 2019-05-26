public class Animal
{

	void Running()
	{
		System.out.println("U are inside the run function");
		System.out.println("Runs vary Fast");
	}

	public static void main(String a[])
	{
		
		System.out.println("Main function runs first!!!");

		//creating object
		Animal tiger=new Animal();
		System.out.println("Tiger object has been created");
		System.out.println("tiger is calling running function");

		tiger.Running();
	}

}


