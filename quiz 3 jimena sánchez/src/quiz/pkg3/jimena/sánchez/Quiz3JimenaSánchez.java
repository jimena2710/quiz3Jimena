
package quiz.pkg3.jimena.sánchez;
import javax.swing.JOptionPane; 

public class Quiz3JimenaSánchez {



    public static void main(String[] args) {
        // Cantidad de productos    

        int productos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de productos:"));

        //Arreglos
        String numeroProductos[] = new String[productos];
        int matrizVentas[][] = new int[7][productos]; //7 son los días de la semana

        // Se ingresa el nombre de los productos
        for (int i = 0; i < productos; i++) {
            numeroProductos[i] = JOptionPane.showInputDialog("Digite el nombre del producto, por favor " + (i + 1));
        }
    }

}
