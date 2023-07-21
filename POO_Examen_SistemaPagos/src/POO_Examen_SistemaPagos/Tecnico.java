package POO_Examen_SistemaPagos;

//Clase hija de Personal
public class Tecnico extends Personal{
	//Define atributos
	String especialidad;
	
	//Constructor con datos de la clase padre y un parametro especialidad
	public Tecnico(String nombre, String cedula, double sueldo, String direccion, double comision,
			String razonIncentivo, double montoIncentivo, String especialidad) {
		super(nombre, cedula, sueldo, direccion, comision, razonIncentivo, montoIncentivo);
		this.especialidad = especialidad;
	}

	//Se sobreescribe el metodo sueldoPagar
	@Override
	public double SueldoPagar() {
		System.out.println("El tecnico tiene especialidad en "+especialidad+" por lo que su comision es de "+comision+"%");
		System.out.println("Ademas se le dio un incentivo de "+montoIncentivo+"% por "+razonIncentivo);
		return (sueldo+sueldo*comision/100)+(sueldo+sueldo*comision/100)*montoIncentivo/100;
	}	
}
