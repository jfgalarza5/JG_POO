package vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class Registro extends JFrame{
    //Creamos una ventana grafica con JFrame
    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    public JPanel panel;
    JTable tabla = new JTable();
    public Registro(){
        setSize(1000,500);
        setTitle("REGISTRO");
        //Para que se cierre el sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //CERRAR VENTANA
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
       colocarBotones();
        ColocarCajaTexto();
        tabla();
        //colocarAreaTexto();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //Damos color al panel
        panel.setBackground(Color.gray);
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("REGISTRAR",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(70,10,100,50);
        label.setForeground(Color.red);
        label.setBackground(Color.green);
        label.setOpaque(true);
        
        //Poner Imagen
        JLabel labelimagen = new JLabel();
        ImageIcon imagen =new ImageIcon("registro.png");
        labelimagen.setBounds(30,110,90,90);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(),Image.SCALE_SMOOTH)));
        //Creamos objeto
        
        JLabel codigo = new JLabel();
        codigo.setText("Codigo:");
        //Agregamos la etiqueta al panel
        panel.add(codigo);
        //Ubicar
        codigo.setHorizontalAlignment(HEIGHT);
        //Fuente
        codigo.setForeground(Color.black);
        codigo.setFont(new Font("arial",Font.PLAIN,12));
        codigo.setBounds(80, 70, 100, 40);
        
        JLabel cedula = new JLabel();
        cedula.setText("Cedula:");
        //Agregamos la etiqueta al panel
        panel.add(cedula);
        //Ubicar
        cedula.setHorizontalAlignment(HEIGHT);
        //Fuente
        cedula.setForeground(Color.black);
        cedula.setFont(new Font("arial",Font.PLAIN,12));
        cedula.setBounds(80, 100, 100, 40);
        
        JLabel Apellido = new JLabel();
        Apellido.setText("Apellido:");
        //Agregamos la etiqueta al panel
        panel.add(Apellido);
        //Ubicar
        Apellido.setHorizontalAlignment(HEIGHT);
        //Fuente
        Apellido.setForeground(Color.black);
        Apellido.setFont(new Font("arial",Font.PLAIN,12));
        Apellido.setBounds(80, 130, 100, 40);
        
        JLabel Nombre = new JLabel();
        Nombre.setText("Nombre:");
        //Agregamos la etiqueta al panel
        panel.add(Nombre);
        //Ubicar
        Nombre.setHorizontalAlignment(HEIGHT);
        //Fuente
        Nombre.setForeground(Color.black);
        Nombre.setFont(new Font("arial",Font.PLAIN,12));
        Nombre.setBounds(80, 160, 100, 40);
        
        JLabel Mail = new JLabel();
        Mail.setText("Mail:");
        //Agregamos la etiqueta al panel
        panel.add(Mail);
        //Ubicar
        Mail.setHorizontalAlignment(HEIGHT);
        //Fuente
        Mail.setForeground(Color.black);
        Mail.setFont(new Font("arial",Font.PLAIN,12));
        Mail.setBounds(80, 190, 100, 40);
        
        JLabel Telefono = new JLabel();
        Telefono.setText("Telefono:");
        //Agregamos la etiqueta al panel
        panel.add(Telefono);
        //Ubicar
        Telefono.setHorizontalAlignment(HEIGHT);
        //Fuente
        Telefono.setForeground(Color.black);
        Telefono.setFont(new Font("arial",Font.PLAIN,12));
        Telefono.setBounds(80, 220, 100, 40);
        
        JLabel Direccion = new JLabel();
        Direccion.setText("Direccion:");
        //Agregamos la etiqueta al panel
        panel.add(Direccion);
        //Ubicar
        Direccion.setHorizontalAlignment(HEIGHT);
        //Fuente
        Direccion.setForeground(Color.black);
        Direccion.setFont(new Font("arial",Font.PLAIN,12));
        Direccion.setBounds(80, 250, 100, 40);
        
        JLabel Materia = new JLabel();
        Materia.setText("Materia:");
        //Agregamos la etiqueta al panel
        panel.add(Materia);
        //Ubicar
        Materia.setHorizontalAlignment(HEIGHT);
        //Fuente
        Materia.setForeground(Color.black);
        Materia.setFont(new Font("arial",Font.PLAIN,12));
        Materia.setBounds(80, 280, 100, 40);
        
        JLabel Estado = new JLabel();
        Estado.setText("Estado:");
        //Agregamos la etiqueta al panel
        panel.add(Estado);
        //Ubicar
        Estado.setHorizontalAlignment(HEIGHT);
        //Fuente
        Estado.setForeground(Color.black);
        Estado.setFont(new Font("arial",Font.PLAIN,12));
        Estado.setBounds(80, 310, 100, 40);
        
    }
    public void colocarBotones(){
        JButton boton = new JButton("Guardar");
        boton.setBounds(30, 400, 100, 50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        boton.setBorder(BorderFactory.createLineBorder(Color.YELLOW,5,true));
        
        JButton boton1 = new JButton("Eliminar");
        boton1.setBounds(300, 400, 100, 50);
        boton1.setEnabled(true);
        boton1.setMnemonic('b');
        ImageIcon imagen1=new ImageIcon("boton.png");
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton1);
        
    }
    public void ColocarCajaTexto(){
        JTextField txtCodigo = new JTextField();
        txtCodigo.setBounds(150, 80, 250, 20);
        panel.add(txtCodigo);
        
        JTextField txtCedula = new JTextField();
        txtCedula.setBounds(150, 110, 250, 20);
        panel.add(txtCedula);
        
        JTextField txtApellido = new JTextField();
        txtApellido.setBounds(150, 140, 250, 20);
        panel.add(txtApellido);
        
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(150, 170, 250, 20);
        panel.add(txtNombre);
        
        JTextField txtMail = new JTextField();
        txtMail.setBounds(150, 200, 250, 20);
        panel.add(txtMail);
        
        JTextField txtTelefono = new JTextField();
        txtTelefono.setBounds(150, 230, 250, 20);
        panel.add(txtTelefono);
        
        JTextField txtDireccion = new JTextField();
        txtDireccion.setBounds(150, 260, 250, 20);
        panel.add(txtDireccion);
        
        JTextField txtMateria = new JTextField();
        txtDireccion.setBounds(150, 260, 250, 20);
        panel.add(txtDireccion);
        
        JComboBox cboxMateria=new JComboBox<String>();
        cboxMateria.setBounds(150, 290, 100, 20);
        cboxMateria.addItem("POO");
        cboxMateria.addItem("EDO");
        cboxMateria.addItem("CALCULO");
        panel.add(cboxMateria);
        
        JRadioButton radEstadoA = new JRadioButton("Activo");
        radEstadoA.setBounds(150, 320, 100, 20);
        panel.add(radEstadoA);
        
        JRadioButton radEstadoI = new JRadioButton("Inactivo");
        radEstadoI.setBounds(150, 350, 100, 20);
        panel.add(radEstadoI);
       
    }
//    public void colocarAreaTexto(){
//        JTextArea textarea1=new JTextArea();
//        textarea1.setBounds(130,130,250,150);
//        panel.add(textarea1);
//        textarea1.setText("POO");
//        textarea1.append("\n Escribir aqui...");
//        
//        JScrollPane barra = new JScrollPane(textarea1);
//        barra.setBounds(130,130,250,150);
//        //vertical
//        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//        panel.add(barra);
//    }
    public void tabla(){
        
        mostrarDatos();
        tabla.setBounds(450, 80, 500, 200);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(450, 80, 500, 200);
        panel.add(scroll);
        
 
    }
    
    public void mostrarDatos(){
        //Se crea los titulos de la tabla y el nombre de la base de datos
        String titulos[]={"Codigo","Cedula","Apellido","Nombre","Mail","Telefono","Direccion","Materia","Estado"};
        String registro[]=new String [10];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `estudiante`";
        //Se agrega los datos de la base de datos al arreglo y luego a la tabla
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
            registro [0]=rs.getString("ID");
            registro [1]=rs.getString("Codigo");
            registro [2]=rs.getString("Cedula");
            registro [3]=rs.getString("Apellido");
            registro [4]=rs.getString("Nombre");
            registro [5]=rs.getString("Mail");
            registro [6]=rs.getString("Telefono");
            registro [7]=rs.getString("Direccion");
            registro [8]=rs.getString("Materia");
            registro [9]=rs.getString("Estado");
            modelo.addRow(registro);
        }
            tabla.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
}
