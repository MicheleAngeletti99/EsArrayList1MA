import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Alberto", 20);
        Student studente2 = new Student("Barbara", 21);
        ArrayList<Student> lista = new ArrayList<>(Arrays.asList(studente1, studente2));
        System.out.println(lista);

        lista.add(new Student("Carlo", 20));
        lista.add(new Student("Daniele", 21));
        lista.add(new Student("Elena", 20));
        lista.add(new Student("Francesca", 21));
        System.out.println(lista);
    }
}