package abc;

public class Main114 extends Sample {
	public void process() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Sample s = new Main114();
		Sample s2 = new Sample();
		test(s);
		test(s2);
	}

	public static void test(Function f) {
		f.process();
	}

}