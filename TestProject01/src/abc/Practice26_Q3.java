package abc;

public class Practice26_Q3 {


	    public static void main(String[] args) {
	        int i = 10;
	        boolean b;
	        boolean bo = (b = true) & (i++ == 10);
	        System.out.println(bo + " " + i);
	    }
	}