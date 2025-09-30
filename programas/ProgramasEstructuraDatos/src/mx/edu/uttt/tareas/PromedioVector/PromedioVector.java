package mx.edu.uttt.tareas.PromedioVector;

import javax.swing.*;

public class PromedioVector {

    private int[] valores;
    private int n;

    // Constructor
    public PromedioVector(int n) {
        this.n = n;
        this.valores = new int[n];
    }

    // Metodo para leer los valores con JOptionPane
    public void leerValores() {
        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el valor " + (i + 1) + ":");
            valores[i] = Integer.parseInt(input);
        }
    }

    // Metodo para calcular el promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        return (double) suma / n;
    }

    // Metodo para contar los menores que el promedio
    public int contarMenores(double promedio) {
        int contador = 0;
        for (int valor : valores) {
            if (valor < promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Metodo que devuelve los valores mayores al promedio en un String
    public String listarMayores(double promedio) {
        StringBuilder mayores = new StringBuilder();
        for (int valor : valores) {
            if (valor > promedio) {
                mayores.append(valor).append(" ");
            }
        }
        return mayores.toString();
    }

}
