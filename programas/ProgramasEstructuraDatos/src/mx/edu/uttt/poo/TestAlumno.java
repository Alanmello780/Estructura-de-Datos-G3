package mx.edu.uttt.poo;

import javax.swing.*;

public class TestAlumno {
    public static void main(String[] args) {
        // Crear una instancia de la clase alumno

        char sexo ='\0';
        boolean activo= false;
        Alumno a1 = new Alumno();

        a1.setNombre(JOptionPane.showInputDialog("Introduce tu nombre"));
        a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad")));

        sexo = JOptionPane.showInputDialog("Introduce tu sexo").charAt(0);
        a1.setSexo(sexo);

        String valor = JOptionPane.showInputDialog("Introduce tu activo");

         activo = valor.equalsIgnoreCase("Si")?true:false;
         a1.setActivo(activo);
        a1.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio")));

        //Constructor que recibe parametros
        String salida = "Resultado \n" +
                "\n Nombre: " + a1.getNombre() +
                "\n Edad: "+ a1.getEdad() +
                "\n Sexo: "+ a1.getSexo()+
                "\n Activo: "+ a1.getActivo() +
                "\n Promedio: "+ a1.getPromedio();


        System.out.println(a1);
    }
}
