package Defaults;

public class MainTest {
	public static void main(String[] args) {
		DefaultInterface def = new DefaultInterface() {
			public void show() {
				System.out.println("Inside Show method");
			}
		};
		def.show();
		int i= def.paly(1, 2);
		System.out.println(i);
	}
}
