package s1t6n2exercici2;

import java.util.List;

public class GenericMethods<T> {

	public static void generic(List<?> lista) {

		for (Object e : lista) {
			System.out.println(e);

		}

	}

}
