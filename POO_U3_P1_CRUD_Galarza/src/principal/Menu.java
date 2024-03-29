/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package principal;

/**
 *
 * @author johng
 */
public class Menu extends javax.swing.JFrame {
    Form_estu estudiante=new Form_estu();
    Form_prof profesor=new Form_prof();
    Horario horario = new Horario();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        ingresar();
    }
    
    public void ingresar(){
        menuBar.setVisible(false);
        Login log = new Login();
        Escritorio.setSize(log.getSize());
        log.setSize(280,283);
        log.setLocation(0,0);
        System.out.println(log.getSize());
        Escritorio.add(log);
        
        Escritorio.revalidate();
        Escritorio.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        editMenu1 = new javax.swing.JMenu();
        editMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/Estudiante.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Estudiante");
        editMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editMenuMenuSelected(evt);
            }
        });
        editMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenuMouseClicked(evt);
            }
        });
        menuBar.add(editMenu);

        editMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/Profesor.png"))); // NOI18N
        editMenu1.setMnemonic('e');
        editMenu1.setText("Profesor");
        editMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editMenu1MenuSelected(evt);
            }
        });
        editMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenu1MouseClicked(evt);
            }
        });
        menuBar.add(editMenu1);

        editMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/Horario.png"))); // NOI18N
        editMenu2.setMnemonic('e');
        editMenu2.setText("Horario");
        editMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                editMenu2MenuSelected(evt);
            }
        });
        editMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenu2MouseClicked(evt);
            }
        });
        menuBar.add(editMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void editMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editMenuMenuSelected
        
    }//GEN-LAST:event_editMenuMenuSelected

    private void editMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editMenu1MenuSelected
        
    }//GEN-LAST:event_editMenu1MenuSelected

    private void editMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Escritorio.add(estudiante);
        estudiante.toFront();
        estudiante.setVisible(true);
        
    }//GEN-LAST:event_editMenuMouseClicked

    private void editMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenu1MouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Escritorio.add(profesor);
        profesor.toFront();
        profesor.setVisible(true);
    }//GEN-LAST:event_editMenu1MouseClicked

    private void editMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_editMenu2MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenu2MenuSelected

    private void editMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenu2MouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Escritorio.add(horario);
        horario.toFront();
        horario.setVisible(true);
    }//GEN-LAST:event_editMenu2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenu1;
    private javax.swing.JMenu editMenu2;
    public static javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
