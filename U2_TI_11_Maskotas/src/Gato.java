import java.util.ArrayList;
import java.util.List;
public class Gato extends Animal{
        public Gato(String nombre, int edad, int cantidad){
            super(nombre, edad, cantidad);
        }

        public String Maullan(){
            return "meow";
        }
}
