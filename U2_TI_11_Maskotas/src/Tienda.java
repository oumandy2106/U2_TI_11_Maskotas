import java.util.ArrayList;
import java.util.List;

public class Tienda {


    List<Animal> animalInventario = new ArrayList<>();
    Animal p1 = new Perro ("Pomeranian", 2, 5);
    Animal p2 = new Perro ("Chihuahua", 3, 7);
    Animal p3 = new Perro ("Chow chow", 4, 10);
    Animal g1 = new Gato ("Persa", 1, 9);
    Animal g2 = new Gato ("Mexicano", 1, 7);
    Animal g3 = new Gato ("Rompehogares", 4, 0);
    animalInventario.add(p1);
    animalInventario.add(p2);
    animalInventario.add(p3);
    animalInventario.add(g1);
    animalInventario.add(g2);
    animalInventario.add(g3);

    public boolean venderAnimal(Cliente cliente, Animal animal){



        return false;
    }
}
