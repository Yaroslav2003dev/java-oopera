package shows;


import persons.Director;
import persons.Person;


public class MusicalShow extends Show{
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, double duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
