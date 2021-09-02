package corejava;
import java.util.Random;
public class FiveRandomnumbers {

	public static void main(String[] args) {
		
				Random abc = new Random();
				int i = 1;
				do 
				{
				int ranNum = abc.nextInt(200);
				System.out.println(ranNum);
				i = i+1;
				}
				while(i <= 5);
			}

		

	}


