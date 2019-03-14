package abc;

public class main6_7 {

	public static void main(String[] args) {
		Sample.num = 10;
		Sample s = new Sample();

		Sample s2 = new Sample();
		s.num += 30;
		s2.num = 10;
		System.out.println(Sample.num);
	}
}
