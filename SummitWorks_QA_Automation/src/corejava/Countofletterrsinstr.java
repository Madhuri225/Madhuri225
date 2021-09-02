package corejava;

public class Countofletterrsinstr {

	public static void main(String[] args) {
	String str = "Hello";
	String ar = str;
	int count = 1;
	System.out.println(str.length());
	System.out.println(ar);
	
	for(int i = 0; i < str.length(); i ++ ) {
		char a = str.charAt(i);
		for(int j = 0; j < str.length(); j ++ ) {
			if (a == str.charAt(j)) {
			count = count+1;
		}
		else {
			count = 1;
		}
		
	}
		System.out.println(count);
	}
	}

}
