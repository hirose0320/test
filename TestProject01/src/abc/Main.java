package abc;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int array[][] = new int[][] { { 1, 2 }, { 2, 3, 4 } };
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array.length);
			
			for (int j = i; j < array[i].length; j++) {
				System.out.println(array[i].length);
				total += array[i][j];
				// int value = array[i][j];
				System.out.println(array[i][j] + "," + "array[" + i + "][" + j + "]");
				// System.out.println("value[" + i + "][" + j + "]=" + value);
			}
		}
		System.out.println(total);

	}

}