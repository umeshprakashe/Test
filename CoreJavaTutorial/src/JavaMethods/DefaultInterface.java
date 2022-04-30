package JavaMethods;

public interface DefaultInterface {

	abstract void show();

	default void print() {
		System.out.println("Inside Interface Default");
	}

	default void print1() {
		System.out.println("Inside Interface Default2");
	}
	
	static void view() {
		System.out.println("Inside view");
	}
	
	static void view1() {
		System.out.println("Inside view Default2");
	}
}
