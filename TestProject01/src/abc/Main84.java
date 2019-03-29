package abc;

public class Main84 {

	public static void main(String[] args) {
		int result = sample();
		System.out.println(result);
	}

	private static int sample() {
		int val = 0;
		try {
			String[] array = { "A", "B", "C" };
			System.out.println(array[3]);
		} catch (RuntimeException e) {
			val = 10;
			System.out.println(val);
			 return val;
		} finally {
			val += 10;
			val = 1000;
			System.out.println(val);
		}
		return val;
	}
}
