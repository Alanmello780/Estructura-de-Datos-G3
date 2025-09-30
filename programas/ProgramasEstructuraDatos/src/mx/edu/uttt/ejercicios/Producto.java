package mx.edu.uttt.ejercicios;

public class Producto {
    //Variabkes de instancia
    private String nombre;
    private int existencia;
    private Double precio;


    //Constructor vacio
    public Producto (){
        this.nombre="Sin nombre";
    }

    public Producto(String nombre, int existencia, Double precio){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setExistencia(existencia);
    }

    //Getters y Setters

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre.toUpperCase();
    }

    public int getExistencia(){
        return this.existencia;
    }

    public void setExistencia(int existencia){

        if (existencia >= 0){
            this.existencia=existencia;
        }

    }

    public Double getPrecio(){
        return this.precio;
    }

    public void setPrecio( double precio){
        if (precio >= 0.0){
            this.precio = precio;
        }
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre+
                "\n Precio: "+this.getPrecio()+
                "\n Existencia: " + this.existencia;
    }


}
