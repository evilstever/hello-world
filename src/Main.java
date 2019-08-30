//hello world

public class Main 
{

	public static void main(String[] args)
	{
		System.out.println("evilstever:StephensAndrew"); //prints info and starts newline
		
		for(int i = 1; i < 101; ++i) //loops 1-100
		{
			if ((i % 5) == 0) //checks if i is divisible by 5
			{
				System.out.println(i); //prints with newline
			}
			else
			{
				System.out.print(i + " "); // prints with space
			}
		}
	}
}