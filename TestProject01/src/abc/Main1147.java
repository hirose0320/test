package abc;

public class Main1147 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] array = new int[2][4];
		array[0] = new int[] { 1, 2, 3, 4,5 };
		array[1] = new int[] { 1, 2 };


		for (int[] a : array) {
			System.out.println("☆");
			for (int b : a) {
				System.out.print("★");
				System.out.print(b);
			}
			System.out.println();
		}

	}

}