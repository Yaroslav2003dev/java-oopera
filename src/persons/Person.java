package persons;

import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person otherPerson = (Person) o;
        return Objects.equals(name,otherPerson.name)&& Objects.equals(surname,otherPerson.surname);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
