package shows;


import persons.Director;
import persons.Person;


public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(String title, double duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
