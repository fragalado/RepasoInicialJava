package aplicacion.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Empleados;

public class ImplEmpleados implements InterfazEmpleados {

	@Override
	public List<Empleados> registroEmpleado(List<Empleados> listaBD) {
		// nombre, apellidos, dni, fechaNac, titulacionMasAlta, numSegSoc, numCuenta
		
		// Scanner para leer los datos
		Scanner sc = new Scanner(System.in);
		
		// Declaramos un objeto de tipo Empleado
		Empleados e = new Empleados();
		
		// Pedimos el nombre
		System.out.print("Introduzca el nombre: ");
		e.setNombre(sc.nextLine());
		
		// Pedimos los apellidos
		System.out.print("Introduzca los apellidos: ");
		e.setApellidos(sc.nextLine());
		
		// Pedimos el dni
		System.out.print("Introduzca el DNI: ");
		e.setDni(sc.nextLine());
		
		// Pedimos la fecha de nacimiento
		System.out.print("Introduzca la fecha de nacimiento: ");
		e.setFechaNac(sc.nextLine());
		
		// Pedimos la titulacion mas alta
		System.out.print("Introduzca la titulacion mas alta: ");
		e.setTitulacionMasAlta(sc.nextLine());
		
		// Pedimos el numero de Seguridad Social
		System.out.print("Introduzca el numero de Seguridad Social: ");
		e.setNumSegSoc(sc.nextInt());
		
		// Pedimos el numero de cuenta
		System.out.print("Introduzca el numero de cuenta: ");
		e.setNumCuenta(sc.nextInt());
		
		// Añadimos el id
		e.setId(devuelveID(listaBD));
		
		// Añadimos el objeto creado a la lista
		listaBD.add(e);
		
		// Devolvemos la lista actualizada
		return listaBD;
	}
	
	/**
	 * Método que recibe una lista de objetos de tipo Empleados y devuelve el ultimo id + 1
	 * @param listaBD
	 * @return
	 */
	private int devuelveID(List<Empleados> listaBD) {
		int id = 0;
		
		// Recorremos la lista para buscar el mayor id
		for (Empleados aux : listaBD) {
			if (aux.getId() > id) {
				id = aux.getId();
			}
		}
		
		// Devolvemos el ultimo id + 1
		return id+1;
	}

	@Override
	public List<Empleados> modificaEmpleado(List<Empleados> listaBD) {
		
		// Scanner para leer los datos
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el id del empleado
		System.out.print("Introduzca el id del empleado a modificar: ");
		int id = sc.nextInt();
		
		// Buscamos el id en la lista, si lo encontramos lo guardamos en una variable
		Empleados e = new Empleados();
		boolean encontrado = false;
		for (Empleados aux : listaBD) {
			if(aux.getId() == id) {
				e = aux;
				encontrado = true;
				break;
			}			
		}
		
		// Si se ha encontrado
		if(encontrado) {
			// Scanner para leer los nuevos datos
			Scanner sc2 = new Scanner(System.in);
			
			int opcion = -1;
			do {
				// Mostraremos los datos y preguntaremos cual se quiere modificar
				System.out.println("\n" + e.toString());
				
				// Ahora preguntamos cual quiere modificar
				System.out.println("\n1. Nombre");
				System.out.println("2. Apellidos");
				System.out.println("3. DNI");
				System.out.println("4. FechaNac");
				System.out.println("5. TitulacionMasAlta");
				System.out.println("6. NumSegSocial");
				System.out.println("7. NumCuenta");
				System.out.println("0. Salir");
				System.out.print("Introduzca una opción: ");
				opcion = sc.nextInt();
				
				if(opcion < 0 || opcion > 7)
					System.err.println("** Error: El valor no está dentro del rango **");
				
				// Ahora controlamos la opción
				switch (opcion) {
					case 1:
						// Nombre
						System.out.print("¿Nuevo nombre?: ");
						e.setNombre(sc2.nextLine());
						break;
					case 2:
						// Apellidos
						System.out.print("¿Nuevos apellidos?: ");
						e.setApellidos(sc2.nextLine());
						break;
					case 3:
						// DNI
						System.out.print("¿Nuevo DNI?: ");
						e.setDni(sc2.nextLine());
						break;
					case 4:
						// FechaNac
						System.out.print("¿Nueva fechaNac?: ");
						e.setFechaNac(sc2.nextLine());
						break;
					case 5:
						// Titulacion Mas Alta
						System.out.print("¿Nueva titulacionMasAlta?: ");
						e.setTitulacionMasAlta(sc2.nextLine());
						break;
					case 6:
						// Numero Seguridad Social
						System.out.print("¿Nuevo numSegSocial?: ");
						e.setNumSegSoc(sc2.nextInt());
						break;
					case 7:
						// Numero Cuenta
						System.out.print("¿Nuevo numCuenta?: ");
						e.setNumCuenta(sc2.nextInt());
						break;
				}
			} while (opcion > 0 && opcion <= 7);
		} else
			System.err.println("** Error: Id no encontrado **");
		
		// Devolvemos la lista actualizada
		return listaBD;
	}

	@Override
	public void exportarEmpleadoFichero(List<Empleados> listaBD) {
		// Scanner para leer los datos
		Scanner sc3 = new Scanner(System.in);
		
		// Inicializamos la interfaz ficheros
		InterfazFicheros intF = new ImplFicheros();
		
		// Preguntaremos si se quiere exportar todos los empleados
		String opcion;
		do {
			System.out.print("¿Quiere exportar todos los empleados al fichero? [s=Si/n=No]: ");
			opcion = sc3.nextLine();
			
			if(!opcion.equals("s") && !opcion.equals("n"))
				System.err.println("** Error: No se ha introducido una opción correcta **");
		} while (!opcion.equals("s") && !opcion.equals("n"));
		
		if(opcion.equals("s")) {
			// Exportamos todos los empleados
			intF.escribeFicheroSobreescribiendo("c:\\FicherosProg\\Java\\repaso.txt", listaBD);
		} else {
			// Exportamos el empleado pidiendo id
			
			// Pedimos el id
			System.out.print("Introduzca el id: ");
			int id = sc3.nextInt();
			
			// Buscamos el id en la lista y si lo encontramos lo guardamos
			boolean encontrado = false;
			Empleados e = new Empleados();
			
			for (Empleados aux : listaBD) {
				if(aux.getId() == id) {
					e = aux;
					encontrado = true;
					break;
				}
			}
			
			// Si lo encontramos lo exportamos al fichero
			// Si no lo encontramos mandamos mensaje de error
			if(encontrado) {
				List<Empleados> listaAuxiliar = new ArrayList<Empleados>();
				listaAuxiliar.add(e);
				intF.escribeFicheroSobreescribiendo("c:\\FicherosProg\\Java\\repaso.txt", listaAuxiliar);
			} else
				System.err.println("** Error: El id introducido no existe **");
		}
	}

}
