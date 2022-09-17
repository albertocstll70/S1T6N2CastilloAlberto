package s1t6n2exercici1;

public class MainExercici1 {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Juan","Perez",25);
		Persona persona2 = new Persona("Lola","Ramirez",48);
		
		
		
		GenericMethods1<Object> generico1 = new GenericMethods1<Object>();
		
		generico1.generic(persona1, persona2, 3);
		
		
		generico1.generic(persona1, "Hola mundo", 2022);
		
		
		
		
		

	}

}
