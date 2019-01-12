package person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    //fix this
    private ArrayList<Person> contacts;

    private Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
        this.contacts = new ArrayList<>();
    }

    public void startApp() {
        System.out.println("Welcome");
        System.out.println("This program manage at contact information");
        System.out.println("You can use those commands: add, get");
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.isEmpty()) {
                break;
            } else if (command.equals("add")) {
                addPerson();
            } else if (command.equals("get")) {
                getPerson();
            }
        }

        System.out.println("Thank you for nothing");

    }

    public void addPerson() {

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.println("Birthday, pleace enter day");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Mouth: ");
        int mouth = Integer.parseInt(scanner.nextLine());
        System.out.println("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        Birthday bd = new Birthday(day, mouth, year);
        Person person = new Person(name, city, bd);

        contacts.add(person);

    }

    public void getPerson() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        for (Person contact : contacts) {

            contact.getPerson();

        }
    }

}
