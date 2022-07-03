import java.util.stream.Stream;

public class ArrayDemo {

	public static void main(String[] args) {
		var names = Stream.of("Prabhu", "Krishna", "Shiva").map(name -> name.toUpperCase());
		names.forEach(name -> System.out.println(name));

	}

}
