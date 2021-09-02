package corejava;

public class Loops {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		} // for loop end
		System.out.println("*******************************************");
		// while
		int i = 1;
		while (i <= 10) 
		{
			System.out.println(i);
			i++;
		}
		System.out.println("*******************************************");
		// do-while
		
		do 
		{
			System.out.println(i);
			i++;
		} while (i <= 10);
	}


	

}
