import java.util.HashSet;
import java.util.Set;

public class AnimalTest {
    public static void main(String[] args) {

        Set<Animal> animals = new HashSet<>();
        for(Animal an: animals){
            an.print();
        }

    }
}
