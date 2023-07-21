package POO_Examen_SistemaPagos;

//Clase hija de Personal
public class Docente extends Personal{
	//Define atributos
	String titulo;
	
	//Constructor con datos de la clase padre y un parametro titulo
	public Docente(String nombre, String cedula, double sueldo, String direccion, double comision,
			String razonIncentivo, double montoIncentivo, String titulo) {
		super(nombre, cedula, sueldo, direccion, comision, razonIncentivo, montoIncentivo);
		this.titulo = titulo;
	}
	
	//Se sobreescribe el metodo sueldoPagar
	@Override
	public double SueldoPagar() {
		System.out.println("El docente tiene titulo en "+titulo+" por lo que su comision es de "+comision+"%");
		System.out.println("Ademas se le dio un incentivo de "+montoIncentivo+"% por que "+razonIncentivo);
		return sueldo+sueldo*comision/100+(sueldo+sueldo*comision/100)*montoIncentivo/100;
	}
	
	
}
