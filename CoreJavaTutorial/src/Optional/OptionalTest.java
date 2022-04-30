package Optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		String str[] = {"A",null,"B","C","D"};

		for (String string : str) {
			System.out.println(string);
		}
		Optional opt = Optional.ofNullable(str[1]);

		if(opt.isPresent()) {
			System.out.println("IF NOT NULL");
		}else {
			System.out.println("IF NULL");
		}
	}
}
