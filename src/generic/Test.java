package generic;

public class Test {
	public static void main(String[] args) {
		Box<String> str = new Box<String>("123");
		System.out.println(str.getValue());
		Box<Integer> num = new Box<Integer>(12324);
		System.out.println(num.getValue().TYPE);
		System.exit(0);
	}
	
}
