package Vista;

import com.mysql.jdbc.Connection;
import Control.Conexion;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static Vista.Menu.Submenu;

public class IngresarAdmin extends javax.swing.JPanel {
    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    Boolean ingreso=false;
    public IngresarAdmin() {
        initComponents();
    }
   
    public void validarCredenciales(){
        String SQL = "SELECT * FROM `credencialesadmin`";
        String User=null;
        String Pass=null;
        //Se agrega los datos de la base de datos al arreglo y luego a la tabla
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                User=rs.getString("User");
                Pass=rs.getString("Pass");
            }
            String Contraseña=new String(txtContraseña.getPassword());
            if(User.equals(txtUsuario.getText())&&Pass.equals(Contraseña)){
                System.out.println("ENTRAMOS");
                Administrador admin = new Administrador();
                admin.setSize(570,520);
                admin.setLocation(0,0);
                Submenu.removeAll();
                Submenu.add(admin);
                Submenu.revalidate();
                Submenu.repaint();
            }else{
                System.out.println("No entramos");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("PROSALES");

        setBackground(new java.awt.Color(255, 102, 153));
        setPreferredSize(new java.awt.Dimension(570, 508));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 34));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INICIAR SESION");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 34));
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 220, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 34));
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 220, -1));

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        validarCredenciales();
    }//GEN-LAST:event_btnEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
