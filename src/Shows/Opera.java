package Shows;

import Persons.Actor;
import Persons.Director;
import Persons.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, double duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
