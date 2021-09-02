package corejava;

import java.util.Random;

public class RandomPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		String uabc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String num = "0123456789";
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String spl = "!@#$%^&*()_:;'<>?,./~`'";
		StringBuilder sb = new StringBuilder();
		for ( int i = 1; i < 8; i++) {
			int ran = rd.nextInt(94);
			String password;
			password = uabc+num+abc+spl;
					//System.out.println(ran);
					//System.out.println(abc.charAt(ran));
					//System.out.println(spl.charAt(ran));
					sb.append(password.charAt(ran));
		}
		String ranstr = sb.toString();
		System.out.println(ranstr); 	
		
		

	}

}
