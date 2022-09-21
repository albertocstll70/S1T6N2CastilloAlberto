package s1t6n2exercici2;

public class GenericMethods<T> {

	@SuppressWarnings("unchecked")
	public static <T> void generic(T... argumento) {

		for (T t : argumento) {

			System.out.println(t);

		}

	}

}
