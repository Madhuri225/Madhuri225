package corejava;

public class SmallLargenum {

	public static void main(String[] args) {
		int numbers[] = { 243, 1, 300, 400, 988, 150, 987, 2 };
		int l = 0;
		int s = 0;
		int len = numbers.length;
			for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (numbers[i] > numbers[j]) {
					l = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = l;
				}
			}
		}
		System.out.println("Largest Number:" + l);
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (numbers[i] < numbers[j]) {
					s = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = s;
				}
			}
		}
		System.out.println("Smallest Number:" + s);

	}
}
