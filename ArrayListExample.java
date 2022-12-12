import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        numbers.add(5);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);


        ArrayList<String> name = new ArrayList<>();
        name.add("ade");
        name.add("John");
        name.add("Joy");
        System.out.println(name);
        name.remove(1);
        System.out.println(name);
        System.out.println(name.get(1));

    }
}
