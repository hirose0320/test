package abc;

public class Sample {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	static int num = 0;

	void Sample() {

		System.out.println("a");
	}

	Sample(String str) {

		System.out.println("b");
	}

}
