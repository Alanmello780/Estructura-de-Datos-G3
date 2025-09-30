package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class testProductoVector {

    public static void main(String[] args) {

        iniciar();

    }

    public static void iniciar(){

        int tamanio =  Integer.parseInt(JOptionPane.showInputDialog("Introduce el numeero de productos"));
        boolean sentinel = true;
        String opcion ="";

        ProductoVector pv = new ProductoVector(tamanio);
        do{
            opcion = JOptionPane.showInputDialog(obtenerMenu());

            switch (opcion){
                case "1":
                    //Insertar el producto
                    if (pv.estaLleno()){
                        JOptionPane.showMessageDialog(null,
                                "Ya no hay espacio para insertar un nuevo producto");
                    }else {
                        pv.agregarProducto(llenarProducto());
                    }
                    break;

                case "2":
                    //Eliminar producto
                    break;

                case "3":
                    //Modificar producto()
                    break;

                case "4":
                    //buscar producto
                    break;

                case "5":
                    //Imprimir producto
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;

                case "6":
                    //Salir
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "Hasta pronto");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while(sentinel);

    }

    public static String obtenerMenu(){
        return "------------------- MENU PRINCIPAL------------------------" +
                "\n1) Insertar producto: " +
                "\n2) Eliminar producto: " +
                "\n3) Modificar producto" +
                "\n4) Buscar producto: " +
                "\n5) Imprimir productos: " +
                "\n6) Salir" +
                "\nEliga una opcion";
    }

    public static Producto llenarProducto(){
        String nombre = JOptionPane.showInputDialog("Intorduc el nombre del producto");
        double predio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia"));

        Producto p1 = new Producto();

        p1.setNombre(nombre);
        p1.setPrecio(predio);
        p1.setExistencia(existencia);

        return p1;
    }
}
