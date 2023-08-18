package modelo;

//Se llama a las tres librerias que permiten la conexion con la base de datos
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    //Se inicializan los atributos para entrar en la base de datos estudiantes
    //donde se asigna las credenciales respectivas
    private static final String drive="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:83/estudiante";
    Connection conectar = null;
    
    //Metodo que permite la conexion 
    public Connection conexion(){
        try{
            Class.forName(drive);
            conectar=(Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error de conexion "+e.getMessage());
        }
        return conectar;
    }
}
