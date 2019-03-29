package abc;

public class Main49 {
	public static void main(String[] args) {

		int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
		int[][] arrayB = arrayA.clone();
		int total = 0;
		for (int[] tmp : arrayB) {
			// 3kai arryaiB[3]
			System.out.println("★");
			for (int val : tmp) {
				System.out.println("☆");
				System.out.println(tmp[2]);
				System.out.println(val);
				total += val;

			}
		}

		System.out.println(total);

	}
}