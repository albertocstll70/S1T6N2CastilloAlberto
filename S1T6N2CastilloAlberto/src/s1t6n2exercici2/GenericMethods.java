package s1t6n2exercici2;


public class GenericMethods<T> {
//
//	public static void generic(List<?> lista) {
//
//		for (Object e : lista) {
//			System.out.println(e);
//
//		}
//
//	}
	
	@SuppressWarnings("unchecked")
	public static <T> void generic( T...argumento) {
		
		for(T t: argumento) {
			
			System.out.println(t);
			
			
		}
		
		
		
		
		
	}

	
	
	

}
