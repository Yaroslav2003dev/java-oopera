package persons;

import java.util.Objects;

public class Actor extends Person {
    protected float height;

    public Actor(String name, String surname, Gender gender, float height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor otherActor = (Actor) o;
        return Objects.equals(name,otherActor.name)&& Objects.equals(surname,otherActor.surname)&&
                Objects.equals(height,otherActor.height);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    @Override
    public String toString() {
        return  name +" "+ surname + " (" + height +" см.)";

    }
}
