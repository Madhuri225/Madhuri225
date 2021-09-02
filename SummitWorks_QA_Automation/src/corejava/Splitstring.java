package corejava;

public class Splitstring {

	public static void main(String[] args) {
		String hello = " ,ab;gh,bc;pq#kk$bb";
		String[] strHello = hello.split("[,;#$]");			
		
		System.out.println("Number of substrings: "+strHello.length);			
		for (int i=0; i < strHello.length; i++) {
			System.out.println("Str["+i+"]:"+strHello[i]);
		}

	}

}
