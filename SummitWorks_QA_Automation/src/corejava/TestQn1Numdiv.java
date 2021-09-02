package corejava;

public class TestQn1Numdiv {

	public static void main(String[] args) {
		for(int i = 1; i<=31; i++){
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("This number is division by both 3 & 5");
			}
			else if(i % 3 == 0){
				System.out.println("This number is divisible by 3");
			}
			else if(i % 5 == 0){
				System.out.println("This number is divisible by 5");
			}
			else
		 {
				System.out.println(i);
			}
						
			}
		}

	}


