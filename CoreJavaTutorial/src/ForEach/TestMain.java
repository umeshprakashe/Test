package ForEach;

import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		List list = Arrays.asList("A","S","D","F","G");

		list.forEach(s->{
			System.out.println(s);
		});
	}

}
