package AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        names.add("Priyanshu");
        numbers.add("37489403");
        names.add("Harish");
        numbers.add("7458399303");
        names.add("Tarun");
        numbers.add("748573903");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(name)) {
                System.out.println("Number: " + numbers.get(i));
            }
        }
    }
}
