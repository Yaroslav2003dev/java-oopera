package shows;

import persons.Director;
import persons.Person;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, double duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
