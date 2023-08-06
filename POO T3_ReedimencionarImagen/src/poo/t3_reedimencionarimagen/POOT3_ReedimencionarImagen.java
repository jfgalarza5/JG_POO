package poo.t3_reedimencionarimagen;
import java.util.Scanner;
import javax.swing.JFrame;
public class POOT3_ReedimencionarImagen {

    public static void main(String[] args) {
        String ubicacion=null;
        int opc;
        Scanner in = new Scanner(System.in);
        //Menu para escoger la imagen
        System.out.println("===MENU===");
        System.out.println("1. Paisaje");
        System.out.println("2. Hola mundo");
        System.out.println("3. Logo espe");
        opc=in.nextInt();
        in.nextLine();
        switch(opc){
            case 1:
                ubicacion="C:\\Users\\johng\\OneDrive\\Escritorio\\paisaje.jpg";
                break;
            case 2:
                ubicacion="C:\\Users\\johng\\OneDrive\\Escritorio\\holamundo.png";
                break;
            case 3:
                ubicacion="C:\\Users\\johng\\OneDrive\\Escritorio\\espe.png";
                break;
        }
        
        //Se escoge las nuevas dimensiones de la imagen
        System.out.println("Ingresa la nueva altura: ");
        int h=in.nextInt();
        System.out.println("Ingresa el ancho de la imagen: ");
        int w=in.nextInt();
        in.nextLine();
        
        //Instanciamos un objeto Jframe que nos mostrara una ventana en el computador
        JFrame ventana = new JFrame("Redimensionar Imagen");
        ventana.setSize(800,600);
        CargarImagen img=new CargarImagen();
        img.cargarimagen(ubicacion, w, h);
        ventana.add(img);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
