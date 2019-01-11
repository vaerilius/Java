package person;

import java.util.ArrayList;

class People {

    private ArrayList<Person> people;

    public People() {
        this.people = new ArrayList<>();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(Person people) {
        this.people.add(people);
    }

    @Override
    public String toString() {
        String allPersons = "";
        System.out.println("People");
        for (Person person : people) {
            allPersons += person.getName() + " " + person.getCity() + " " + person.getBirthday() + "\n";

        }
        return allPersons;
    }

}
