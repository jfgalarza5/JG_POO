package POO_Examen_SistemaPagos;

//Clase hija de Personal
public class Administrativo extends Personal{
	//Define atributos
	String campo;

	//Constructor con datos de la clase padre y un parametro campo
	public Administrativo(String nombre, String cedula, double sueldo, String direccion, double comision,
			String razonIncentivo, double montoIncentivo, String campo) {
		super(nombre, cedula, sueldo, direccion, comision, razonIncentivo, montoIncentivo);
		this.campo = campo;
	}

	//Se sobreescribe el metodo sueldoPagar
	@Override
	public double SueldoPagar() {
		System.out.println("El Adiministrador administra el campo "+campo+" por lo que su comision es de "+comision+"%");
		System.out.println("Ademas se le dio un incentivo de "+montoIncentivo+"% por "+razonIncentivo);
		return (sueldo+sueldo*comision/100)+(sueldo+sueldo*comision/100)*montoIncentivo/100;
	}	
}