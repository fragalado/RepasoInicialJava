package aplicacion.servicios;

import java.util.Scanner;

public class ImplMenu implements InterfazMenu {

	@Override
	public int Menu() {
		// Scanner para leer
		Scanner sc = new Scanner(System.in);
		
		// Mostramos el menu
		int opcion = -1;
		do {
			System.out.println("1. Registro empleado");
			System.out.println("2. Modificar empleado");
			System.out.println("3. Exportar fichero");
			System.out.println("0. Cerrar app");
			System.out.print("Introduzca una opción: ");
			opcion = sc.nextInt();
			
			if(opcion < 0 || opcion > 3)
				System.err.println("** Error: El valor no está dentro del rango **");
		} while (opcion < 0 || opcion > 3);
		
		// Devolvemos la opcion
		return opcion;
	}

}
