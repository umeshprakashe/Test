package LambdaExpression;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("Inside Main CLass");

		//FunctionalInterfaces impl = new FunctionalInterfacesImpl();
		//impl.show();

		/*
		 * FunctionalInterfaces I = new FunctionalInterfaces() { public void show() {
		 * System.out.println("Inside FunctionalInterfacesImpl Anonomus Block"); } };
		 * I.show();
		 */

		/*
		 * FunctionalInterfaces I =
		 * ()->System.out.println("Insisde Lambada Expression"); I.show();
		 */

		Runnable R= ()->{
			System.out.println("Inside Run Method");
			System.out.println("NAme : "+Thread.currentThread());
		};

		Thread a = new Thread(R);
		a.setName("Hello");
		a.start();
	}

}
