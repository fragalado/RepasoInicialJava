package aplicacion.controladores;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import aplicacion.entidades.Empleados;
import aplicacion.servicios.ImplEmpleados;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.InterfazEmpleados;
import aplicacion.servicios.InterfazMenu;

public class Menu {

	public static void main(String[] args) {
		
		// Lista donde guardaremos los objetos de tipo Empleados
		List<Empleados> listaBD = new ArrayList<>();
		
		// Inicializamos la interfaz menu y empleados
		InterfazMenu intM = new ImplMenu();
		InterfazEmpleados intE = new ImplEmpleados();
		
		// Mostramos el menu
		int opcion = -1;
		do {
			try {
				opcion = intM.Menu();
			} catch (InputMismatchException e) {
				System.err.println("** Error: El valor introducido no es un entero **");
			}
			
			switch (opcion) {
			case 1:
				// Registro Empleado
				try {
					intE.registroEmpleado(listaBD);
				} catch (Exception e) {
					System.err.println("** Error: No se ha podido registrar empleado **");
				}
				break;
			case 2:
				// Modificar Empleado
				try {
					intE.modificaEmpleado(listaBD);
				} catch (Exception e) {
					System.err.println("** Error: No se ha podido modificar el empleado **");
				}
				break;
			case 3:
				// Exportar fichero
				try {
					intE.exportarEmpleadoFichero(listaBD);
				} catch (Exception e) {
					System.err.println("** Error: No se ha podido exportar al fichero **");
				}
				break;
			case 0:
				// Cerrar app
				System.out.println("Cerrando app...");
				break;
			}
		} while (opcion != 0);
	}

}
