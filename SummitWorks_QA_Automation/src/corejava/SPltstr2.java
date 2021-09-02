package corejava;

public class SPltstr2 {

	public static void main(String[] args) {
		String str = "aa;bb;cc;dd-ee-ff;ii;jj-kk";
		String[] s = str.split("[;-]");
		System.out.println("Length of string when converted to array:"+s.length);
		for(int i = 0; i < s.length; i++) {
			System.out.println("["+i+"]=" +s[i]);
		}

	}

}
