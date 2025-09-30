package mx.edu.uttt.tareas.PromedioVector;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Pedir cantidad de valores
        String inputN = JOptionPane.showInputDialog("Ingrese la cantidad de valores N:");
        int n = Integer.parseInt(inputN);

        // Crear objeto de la clase PromedioVector
        PromedioVector vector = new PromedioVector(n);

        // Leer datos
        vector.leerValores();

        // Calcular promedio
        double promedio = vector.calcularPromedio();

        // Contar menores
        int menores = vector.contarMenores(promedio);

        // Listar mayores
        String mayores = vector.listarMayores(promedio);

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "El promedio es: " + promedio +
                        "\nCantidad de valores menores al promedio: " + menores +
                        "\nValores mayores al promedio: " + mayores);
    }

}
