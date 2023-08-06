package poo.t3_reedimencionarimagen;

import javax.swing.JPanel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;

public class CargarImagen extends JPanel{
    //Atributos para recoger la imagen
    BufferedImage image;
    Image escala;
    
    //Metodo para cargar imagen
    public void cargarimagen(String ubicacion, int w, int h){
        try{
            image = ImageIO.read(new File(ubicacion));
            escala = image.getScaledInstance(w, h, image.SCALE_DEFAULT);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
        g.drawImage(escala, image.getWidth(this), 0, this);
    }
}
