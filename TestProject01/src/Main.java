
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "a. b. c. d. e";
		String[] array = str.split("\\a");
		for (String s : array) {
			System.out.print(s);
		}

	}

}
