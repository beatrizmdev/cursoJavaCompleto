package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

	    //union
		Set<Integer> c = new TreeSet<>(a); // o conjunto c vai ser uma cópia do conjunto a
		c.addAll(b); // união do conjunto c com o conjunto b
		System.out.println(c);

		//intersection
		Set<Integer> d = new TreeSet<>(a); // conj d é cópia do conj a
		d.retainAll(b); // intersecção de d em b (o que tem em d e que tb tem em b)
		System.out.println(d);

		//difference
		Set<Integer> e = new TreeSet<>(a); // conj e é cópia do conj a
		e.removeAll(b); // remove do conjunto e tudo o que tem em b
		System.out.println(e);
	}
}