package JavaMethods;

public class DefaultClass implements DefaultInterface   {

	public static void main(String[] args) {

		DefaultClass class1 = new DefaultClass();

		class1.show();
		class1.print();
		class1.print1();

		DefaultInterface.view();
		DefaultInterface.view1();
	}

	@Override
	public void show() {
		System.out.println("Inside SHow method");
	}

}
