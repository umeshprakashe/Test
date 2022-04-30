package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {

		List <String> list = new ArrayList<String>();
		list.add("Umesh");
		list.add("Ramesh");
		list.add("Suresh");

		//System.out.println(list.stream().anyMatch(s->s.getEmpName().contains("h")));
		//System.out.println(list.stream().allMatch(s->s.getEmpName().contains("h")));
		//System.out.println(list.stream().noneMatch(s->s.getEmpName().contains("h")));
		//List list = Arrays.asList(1,2,1,3,4,6);

		Optional str =list.stream().filter(a-> a.contains("a")).findAny();
		System.out.println(str.get());

	}
}
