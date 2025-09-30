package mx.edu.uttt.tareas.OperacionesVector;

import javax.swing.*;

public class OperacionesVector {

    private int[] A;
    private int[] B;
    private int n;

    public OperacionesVector(int n) {
        this.n = n;
        this.A = new int[n];
        this.B = new int[n];
    }

    // Leer los valores de los vectores A y B
    public void leerVectores() {
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese A[" + (i + 1) + "]:"));
        }
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese B[" + (i + 1) + "]:"));
        }
    }

    // Operaciones
    public int[] suma() {
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
    }

    public int[] resta() {
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i] = A[i] - B[i];
        }
        return C;
    }

    public int[] multiplicacion() {
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i] = A[i] * B[i];
        }
        return C;
    }

    public double[] division() {
        double[] C = new double[n];
        for (int i = 0; i < n; i++) {
            if (B[i] != 0) {
                C[i] = (double) A[i] / B[i];
            } else {
                C[i] = Double.NaN; // División por cero
            }
        }
        return C;
    }

    public double[] potencia() {
        double[] C = new double[n];
        for (int i = 0; i < n; i++) {
            C[i] = Math.pow(A[i], B[i]);
        }
        return C;
    }

    // Métodos para mostrar vectores
    public String mostrarVector(int[] v) {
        StringBuilder sb = new StringBuilder();
        for (int valor : v) {
            sb.append(valor).append(" ");
        }
        return sb.toString();
    }

    public String mostrarVector(double[] v) {
        StringBuilder sb = new StringBuilder();
        for (double valor : v) {
            sb.append(valor).append(" ");
        }
        return sb.toString();
    }

}
