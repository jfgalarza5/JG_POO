package controlador;
//Se importan las librerias para que funcione el controlador

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import vista.Vista;
import modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener{
    //Se crean los objetos vista y modelo
    public Vista vista;
    public Modelo modelo;
    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    //Se crea un constructor con los parametros de los objetos vista y modelo
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnGuardar.addActionListener(this);
        mostrarDatos();
    }
    //Metodo que inicia el formulario con su titulo y tamaño
    public void iniciar(){
        vista.setTitle("Productos");
        vista.setLocationRelativeTo(null);
    }
    //Se sobreescribe el metodo actionPerformed para que funcione el boton guardar
    //Se obtiene los datos del formulario y se los inserta a la tabla con un vector
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String SQL="INSERT INTO productos(Nombre,Precio)values(?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            //Se ingresan los datos de las cajas de texto a la base de datos
            pst.setString(1, vista.txtNombre.getText());
            pst.setString(2,vista.txtPrecio.getText());
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            mostrarDatos();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
    
    public void mostrarDatos(){
        String titulos[]={"ID","Nombre","Precio"};
        String registro[]=new String [4];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `productos`";
        //Se agrega los datos de la base de datos al arreglo y luego a la tabla
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
            registro [0]=rs.getString("ID");
            registro [1]=rs.getString("Nombre");
            registro [2]=rs.getString("Precio")+" $";
            modelo.addRow(registro);
        }
            vista.Tabla.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
}
