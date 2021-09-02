package corejava;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
	Scanner age = new Scanner(System.in);
    int age1 = age.nextInt();
    if(age1< 2) {
    	System.out.println("Infant");
        
    }else if (age1 >= 3 && age1 < 12) {
		System.out.println("Child");
	}
	 else if (age1 >= 12 && age1 < 25) {
			System.out.println("Younger");
		}
	 else if (age1 >= 25 && age1 < 59) {
			System.out.println("Adult");
		}
	 else if (age1 >=60){
			System.out.println("Senior Citizen");
		}
	}

}
