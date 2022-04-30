package Functional;

public class TestMain {

	public static void main(String[] args) {

		FunctionalOne functionalOne= new FunctionalOne() {
			public void display() {
				System.out.println("Inside Anonomus Method");	
			}
		};  
		functionalOne.display();

		FunctionalOne functionalTwo =	()->{
			System.out.println("Inside Lamda Method");
		};
		functionalTwo.display();
	}
}
