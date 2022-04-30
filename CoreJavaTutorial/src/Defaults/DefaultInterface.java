package Defaults;

public interface DefaultInterface {

	abstract void show();
	default int paly(int a,int b ) {
		System.out.println("Inside Play Method");
		return a+b;
	}
}
