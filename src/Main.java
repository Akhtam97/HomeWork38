import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<TaskADogs>dogs = new HashSet<>();
        for (int i =1; i<=40;i++ ){
            dogs.add(new TaskADogs((i+2)+0.2, "Собака"+i, Breed.DALMATIAN));
        }
        for (TaskADogs d: dogs
             ) {
            System.out.println(d);
        }
    }
}
