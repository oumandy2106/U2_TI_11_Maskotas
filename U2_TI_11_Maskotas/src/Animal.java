import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private String nombre;
    private int edad;
    private int cantidad;

    public Animal (String nombre, int edad, int cantidad){
        this.nombre = nombre;
        this.edad = edad;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }


}
