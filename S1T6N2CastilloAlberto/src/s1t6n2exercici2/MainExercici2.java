package s1t6n2exercici2;

import java.util.ArrayList;

import s1t6n2exercici1.Persona;

public class MainExercici2 {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", "Perez", 25);
		Persona persona2 = new Persona("Lola", "Ramirez", 48);
		Persona persona3 = new Persona("Marcos", "Rafael", 33);

		ArrayList<Persona> listPersonas = new ArrayList<Persona>();
		listPersonas.add(persona1);
		listPersonas.add(persona2);
		listPersonas.add(persona3);

		GenericMethods<Object> generico1 = new GenericMethods<Object>();

		ArrayList<String> lista = new ArrayList<String>();

		lista.add("Juan");
		lista.add("Pedro");
		lista.add("Montserrat");
		lista.add("George");

		generico1.generic("Hola mundo", "XY", 3);

		generico1.generic("Hola mundo", "m", 3, 1264, 25665);

		generico1.generic(persona1, persona2);

	}

}
