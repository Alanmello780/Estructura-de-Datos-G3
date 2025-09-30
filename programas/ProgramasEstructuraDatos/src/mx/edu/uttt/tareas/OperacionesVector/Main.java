package mx.edu.uttt.tareas.OperacionesVector;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los vectores:"));
        OperacionesVector op = new OperacionesVector(n);

        // Leer valores de los vectores
        op.leerVectores();

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "Suma: " + op.mostrarVector(op.suma()) +
                        "\nResta: " + op.mostrarVector(op.resta()) +
                        "\nMultiplicación: " + op.mostrarVector(op.multiplicacion()) +
                        "\nDivisión: " + op.mostrarVector(op.division()) +
                        "\nPotencia (A^B): " + op.mostrarVector(op.potencia()));
    }
}
