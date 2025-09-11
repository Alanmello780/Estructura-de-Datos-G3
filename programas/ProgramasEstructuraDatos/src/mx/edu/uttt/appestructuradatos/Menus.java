package mx.edu.uttt.appestructuradatos;

public class Menus {

    public static String obtenerMenuPrincipal() {
        String menu = "===== MENU PRINCIPAL ====="+
                "\n1) Arreglos" +
                "\n2) Recursividad"+
                "\n3) Listas Enlazadas"+
                "\n4) Pilas y colas"+
                "\n5) Arboles Binarios"+
                "\n6) Salir"+
                "\nElegir Opcion: ";

        return menu;
    }

    public static String obtenerMenuArreglo(){
        return "==== MENU ARREGLOS ===="+
                "\n1) Vectores"+
                "\n2) Matrices"+
                "\n3) Regresar"+
                "\nElegir Opcion: ";
    }
}
