package aplicacion.entidades;

public class Empleados {
	// Atributos

	private int id;
	private String nombre, apellidos, dni, fechaNac, titulacionMasAlta;
	private int numSegSoc, numCuenta;

	// Constructores -> Constructor vacío

	// Propiedades básicas
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getTitulacionMasAlta() {
		return titulacionMasAlta;
	}

	public void setTitulacionMasAlta(String titulacionMasAlta) {
		this.titulacionMasAlta = titulacionMasAlta;
	}

	public int getNumSegSoc() {
		return numSegSoc;
	}

	public void setNumSegSoc(int numSegSoc) {
		this.numSegSoc = numSegSoc;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNac=" + fechaNac
				+ ", titulacionMasAlta=" + titulacionMasAlta + ", numSegSoc=" + numSegSoc + ", numCuenta=" + numCuenta
				+ "]";
	}
}
