package bookmymovies.security.provider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		IntStream.iterate(1, a -> a + 1)
				.limit(3)
				.forEach(System.out::println);;
				
	}
	
}
