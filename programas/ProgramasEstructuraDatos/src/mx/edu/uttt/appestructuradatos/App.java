package mx.edu.uttt.appestructuradatos;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){

        String opcion="";
        boolean sentinel = true;

        do {

            opcion = JOptionPane.showInputDialog(Menus.obtenerMenuPrincipal());

            switch (opcion){
                case "1":
                    arreglo();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Opcion 2");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Opcion 4");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Opcion 5");
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "I'II be back");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no encontrada");
            }
        }while (sentinel);
    }


    public static void arreglo(){
        String opcion="";
        boolean sentinel=true;
        do{

        opcion = JOptionPane.showInputDialog(Menus.obtenerMenuArreglo());

        switch (opcion){
            case "1":
                JOptionPane.showMessageDialog(null, "Vectores");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Matrices");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Gracias por Utilizar los arreglos");
                sentinel = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
        }while(sentinel);
    }
}
