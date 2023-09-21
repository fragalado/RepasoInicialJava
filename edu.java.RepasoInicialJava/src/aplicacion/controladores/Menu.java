package aplicacion.controladores;

import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.InterfazMenu;

public class Menu {

	public static void main(String[] args) {
		// Inicializamos la interfaz menu y empleados
		InterfazMenu intM = new ImplMenu();
		
		// Mostramos el menu
		int opcion = -1;
		do {
			opcion = intM.Menu();
			
			switch (opcion) {
			case 1:
				// Registro Empleado
				System.out.println("Ha elegido registro empleado");
				break;
			case 2:
				// Modificar Empleado
				System.out.println("Ha elegido modificar empleado");
				break;
			case 3:
				// Exportar fichero
				System.out.println("Ha elegido exportar fichero");
				break;
			case 0:
				// Cerrar app
				System.out.println("Cerrando app...");
				break;
			}
		} while (opcion != 0);
	}

}
