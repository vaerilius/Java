package person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        People people = new People();
        Person timo = new Person("Timo", "Vantaa", new Birthday(1, 1, 2018));

        Person jaakko = new Person("Jaakko", "Helsinki", new Birthday(2, 2, 2018));

        people.setPeople(timo);
        people.setPeople(jaakko);
        System.out.println(people);
    }

}
