package POO_Examen_SistemaPagos;

//Clase padre Personal
public abstract class Personal {
	//Atributos protegidos porque son datos personales
	protected String nombre;
	protected String cedula;
	protected double sueldo;
	protected String direccion;
	protected double comision;
	String razonIncentivo;
	double montoIncentivo;
	
	//Constructor con sobrecarga
	public Personal(String nombre, String cedula, double sueldo, String direccion, double comision,
			String razonIncentivo, double montoIncentivo) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.sueldo = sueldo;
		this.direccion = direccion;
		this.comision = comision;
		this.razonIncentivo = razonIncentivo;
		this.montoIncentivo = montoIncentivo;
	}
	public Personal() {
	}
	
	//Metodos getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	//Metodo abstracto que calcula el pago total
	public abstract double SueldoPagar();
}
