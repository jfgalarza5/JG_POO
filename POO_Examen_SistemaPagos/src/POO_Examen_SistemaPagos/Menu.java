package POO_Examen_SistemaPagos;

import java.util.*;

public class Menu {
	//Se definen los atributos
	Scanner in = new Scanner(System.in);
	String nombre;
	String cedula;
	double sueldo;
	String direccion;
	double comision;
	String razonIncentivo;
	double montoIncentivo;
	int opc,sino;
	String titulo,especialidad,campo,area;
	
	//Metodo menu pricipal
	public void menu() {
		do {
			System.out.println("==SISTEMA DE PAGOS==");
			System.out.println("1. Agregar Docente");
			System.out.println("2. Agregar Tecnico");
			System.out.println("3. Agregar Adimnistrativo");
			System.out.println("4. Agregar Limpieza");
			opc=in.nextInt();
			in.nextLine();
			switch(opc) {
				case 1:
					System.out.println("==DOCENTE==");
					pedirDatos();
					System.out.println("Titulo: ");
					titulo=in.nextLine();
					Docente docente = new Docente(nombre,cedula,sueldo,direccion,comision,razonIncentivo,montoIncentivo,titulo);
					sueldos(docente);
					break;
				case 2:
					System.out.println("==TECNICO==");
					pedirDatos();
					System.out.println("Especialidad: ");
					especialidad=in.nextLine();
					Tecnico tecnico = new Tecnico(nombre,cedula,sueldo,direccion,comision,razonIncentivo,montoIncentivo,especialidad);
					sueldos(tecnico);
					break;
				case 3:
					System.out.println("==ADIMNISTRATIVO==");
					pedirDatos();
					System.out.println("Campo: ");
					campo=in.nextLine();
					Administrativo admin = new Administrativo(nombre,cedula,sueldo,direccion,comision,razonIncentivo,montoIncentivo,campo);
					sueldos(admin);
					break;
				case 4:
					System.out.println("==LIMPIEZA==");
					pedirDatos();
					System.out.println("Area: ");
					area=in.nextLine();
					Limpieza limpieza = new Limpieza(nombre,cedula,sueldo,direccion,comision,razonIncentivo,montoIncentivo,area);
					sueldos(limpieza);
					break;
			}
		}while(opc!=5);
	}
	
	//Metodo que pide los datos personales
	public void pedirDatos() {
		System.out.println("Nombre: ");
		nombre=in.nextLine();
		System.out.println("Cedula: ");
		cedula=in.nextLine();
		System.out.println("Sueldo: ");
		sueldo=in.nextDouble();
		in.nextLine();
		System.out.println("Direccion: ");
		direccion=in.nextLine();
		System.out.println("Porcentaje de Comision: ");
		comision=in.nextDouble();
		in.nextLine();
		System.out.println("Va a agregar incentivo (si=1,no=2)");
		sino=in.nextInt();
		if(sino==1) {
			System.out.println("Razon del incentivo: ");
			razonIncentivo=razonIncentivo();
		}
	}
	
	//Metodo que muestra el sueldo total
	public void sueldos(Personal personal) {
		double sueldototal = personal.SueldoPagar();
		System.out.println("El sueldo total es "+sueldototal);
	}
	
	//Menu de opciones para escoger la razon del incentivo
	public String razonIncentivo() {
		String razon;
		System.out.println("Ingrese la razon del incentivo:");
		System.out.println("1. LLego temprano (10% de incentivo)");
		System.out.println("2. Es amable (5% de incentivo)");
		System.out.println("3. Horas extras (25% de incentivo)");
		System.out.println("4. Es padre/madre de familia (20% de incentivo)");
		opc=in.nextInt();
		in.nextLine();
		switch(opc) {
		case 1:
			razon="LLego temprano";
			this.montoIncentivo=10;
			return razon;
		case 2:
			razon="Es amable";
			montoIncentivo=5;
			return razon;
		case 3:
			razon="Horas extras";
			montoIncentivo=25;
			return razon;
		case 4:
			razon="Es padre/madre de familia";
			montoIncentivo=20;
			return razon;
		}
		return null;
	}
}
