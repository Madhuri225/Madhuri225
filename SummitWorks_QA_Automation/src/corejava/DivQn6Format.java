package corejava;

public class DivQn6Format {

	public static void main(String[] args) {
		StringBuilder stb1 = new StringBuilder();
		StringBuilder stb2 = new StringBuilder();
		StringBuilder stb3 = new StringBuilder();
		for(int i=1; i<=31; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				int j = i;
				stb1.append(j);
			} else if (i % 3 == 0) {
				int k = i;
				stb2.append(k);
					
			} else if(i % 5 == 0) {
				int l = i;
			
				stb3.append(l);
			    	
			}// else {
				//	System.out.println("Not divisible by 3 or 5::" +i);
			//}
		}
		String both = stb1.toString();
		System.out.println("Divisible by both 3 and 5::"+both );
		String three = stb2.toString();
		System.out.println("Divisible by 3::"+three);
		String five = stb3.toString();
		System.out.println("Divisible by 5::"+five);
		
	}

}
