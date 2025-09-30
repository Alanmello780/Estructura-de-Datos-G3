***Java
package mx.edu.uttt.arreglo;
import javax.swing.JOptionPane;
import javax.swing.*;

public class VectoresDobles {
    public static void main(String[] args) {
        int tamanio = 0;

        tamanio = obtenerTamanio();

        double arr [] = new double[tamanio];
        double arr2 [] = new double [tamanio];
        llenarArreglo(arr);
        imprimir(arr);
    }

    public static int obtenerTamanio(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
    }

    public static void llenarArreglo(double [] vector){
        for (int i=0; i<=2 ; i++ ){
            vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la pocicion ["+i+"] :"));
        }
    }

    public static void imprimir(double vector []){
        String salida="";
        for (double valor: vector){
            salida += "| "+valor + " |";
        }

        JOptionPane.showMessageDialog(null, salida);
    }
}
***
