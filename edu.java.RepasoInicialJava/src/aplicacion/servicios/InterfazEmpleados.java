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
}
