package Functional;

@FunctionalInterface
public interface FunctionalOne { 
	public void display();
	public static void display2(){};
	public static void display3(){};
	default void display4() {};
	default void display5() {}; 
}
