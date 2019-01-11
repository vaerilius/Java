package person;

public class Person {

    private String name;
    private String city;
    private Birthday birthday;

    public Person(String name, String city, Birthday birthday) {
        this.name = name;
        this.city = city;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "name= " + name + ", city= " + city + ", birthday= " + birthday;
    }

}
