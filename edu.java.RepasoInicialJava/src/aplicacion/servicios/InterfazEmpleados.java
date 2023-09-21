package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Empleados;

/**
 * Interfaz que define los métodos que darán servicio a Empleados
 */
public interface InterfazEmpleados {

	/**
	 * Método que registra un empleado
	 * Pide los datos, crea un objeto Empleado, lo añade a la lista dada por parámetros
	 * Devuelve la lista actualizada
	 * @param listaBD
	 * @return
	 */
	public List<Empleados> registroEmpleado(List<Empleados> listaBD);
	
	/**
	 * Método que modifica empleado segun su id
	 * Pide el id del empleado a modificar
	 * Devuelve la lista actualizada
	 * @param listaBD
	 * @return
	 */
	public List<Empleados> modificaEmpleado(List<Empleados> listaBD);
	
	/**
	 * Método que exportará a un fichero todos los empleados o un empleado según su ID
	 * Se exportará toda la información excepto el numero de Seguridad Social y el numero de cuenta bancaria
	 * @param listaBD
	 */
	public void exportarEmpleadoFichero(List<Empleados> listaBD);
}
