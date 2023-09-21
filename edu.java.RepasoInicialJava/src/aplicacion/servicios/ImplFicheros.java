package aplicacion.servicios;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import aplicacion.entidades.Empleados;

/**
 * Implementación de la interfaz ficheros
 */
public class ImplFicheros implements InterfazFicheros {

	@Override
	public void escribeFicheroSobreescribiendo(String ruta, List<Empleados> listaBD) {
		
		// Variables necesarias para escribir en un fichero
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			
			fw = new FileWriter(ruta);
			pw = new PrintWriter(fw);
			
			// Escribimos la cabecera
			pw.println("ID; NOMBRE; APELLIDOS; DNI; FECHANAC; TITULACION MAS ALTA");
			
			// Recorremos la lista y escribimos los datos
			for (Empleados aux : listaBD)
				pw.println(aux.getId() + ";" + aux.getNombre() + ";" + aux.getApellidos() + ";" + aux.getDni() + ";" + aux.getFechaNac() + ";" + aux.getTitulacionMasAlta());
		} catch (Exception e) {
			System.err.println("** Error: No se ha podido abrir el fichero **");
		} finally {
			// Cerramos el fichero
			try {
				if(fw != null)
					fw.close();
			} catch (Exception e2) {
				System.err.println("** Error: No se ha podido cerrar el fichero **");
			}
		}
		
	}

}
