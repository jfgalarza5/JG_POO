package POO_Examen_SistemaPagos;

//Clase hija de Personal
public class Limpieza extends Personal{
	//Define atributos
	String area;

	//Constructor con datos de la clase padre y un parametro area
	public Limpieza(String nombre, String cedula, double sueldo, String direccion, double comision,
			String razonIncentivo, double montoIncentivo, String area) {
		super(nombre, cedula, sueldo, direccion, comision, razonIncentivo, montoIncentivo);
		this.area = area;
	}

	//Se sobreescribe el metodo sueldoPagar
	@Override
	public double SueldoPagar() {
		System.out.println("El Limpieza trabaja en el area "+area+" por lo que su comision es de "+comision+"%");
		System.out.println("Ademas se le dio un incentivo de "+montoIncentivo+"% por "+razonIncentivo);
		return (sueldo+sueldo*comision/100)+(sueldo+sueldo*comision/100)*montoIncentivo/100;
	}	
}
