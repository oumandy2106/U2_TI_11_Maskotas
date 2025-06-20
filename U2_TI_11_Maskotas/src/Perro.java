import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal{
    public Perro(String nombre, int edad, int cantidad){
        super(nombre, edad, cantidad);
    }
    public String Ladran(){

        return "Woof";
    }

}
