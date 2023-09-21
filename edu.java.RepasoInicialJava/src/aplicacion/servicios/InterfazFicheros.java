package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Empleados;

/**
 * Interfaz que define los métodos que darán servicio a Ficheros
 */
public interface InterfazFicheros {
	
	/**
	 * Método que recibe la ruta del fichero y una lista de objetos de tipo Empleado.
	 * El método borrará los datos del fichero y escribirá los datos de la lista pasada por parámetros
	 * @param ruta
	 * @param listaBD
	 */
	public void escribeFicheroSobreescribiendo(String ruta, List<Empleados> listaBD);
}
