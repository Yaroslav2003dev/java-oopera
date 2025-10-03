import Persons.Actor;
import Persons.Director;
import Persons.Gender;
import Persons.Person;
import Shows.Ballet;
import Shows.Opera;
import Shows.Show;

public class Theatre {

    public static void main(String[] args) {
        Actor leonardoDiCaprio=new Actor("Леонардо","Ди Каприо", Gender.MALE,180);
        Actor bradPitt=new Actor("Брэд","Питт", Gender.MALE,175);
        Actor margotRobbie=new Actor("Марго","Робби", Gender.FEMALE,168);
        Person elvisPresley=new Person("Элвис","Пресли",Gender.MALE);
        Person hanzZimmer=new Person("Ханс","Циммер",Gender.MALE);
        Person ludovicEinaudi=new Person("Людовико","Эйнауди",Gender.MALE);

        Director quentinTarantino= new Director("Квентин","Тарантино",Gender.MALE,9);
        Director christopherNolan= new Director("Кристофер","Нолан",Gender.MALE,7);


        Show inHollywood=new Show("Однажды в Голливуде",240,quentinTarantino);
        Opera battleAfterBattle=new Opera("Начало",210,christopherNolan,hanzZimmer,"Сон во сне",6);
        Ballet missionImpossible=new Ballet("Миссия невыполнима",225,christopherNolan,ludovicEinaudi,"Невозможное возможно",elvisPresley);

        inHollywood.addActor(leonardoDiCaprio);
        inHollywood.addActor(bradPitt);
        inHollywood.addActor(margotRobbie);

        battleAfterBattle.addActor(leonardoDiCaprio);
        battleAfterBattle.addActor(bradPitt);

        missionImpossible.addActor(margotRobbie);

        System.out.println();
        System.out.println("Актёры спектакля '"+ inHollywood.getTitle()+"'");
        inHollywood.getActors();

        System.out.println();
        System.out.println("Актёры спектакля '"+ battleAfterBattle.getTitle()+"'");
        battleAfterBattle.getActors();

        System.out.println();
        System.out.println("Актёры спектакля '"+ missionImpossible.getTitle()+"'");
        missionImpossible.getActors();

        System.out.println();
        battleAfterBattle.replaceActor(margotRobbie,"Ди Каприо");
        System.out.println("Актёры спектакля "+ battleAfterBattle.getTitle());
        battleAfterBattle.getActors();
        System.out.println();
        battleAfterBattle.replaceActor(bradPitt,"Круз");

        System.out.println();
        System.out.println("Текст Либретто спектакля '"+ battleAfterBattle.getTitle()+"'");
        System.out.println(battleAfterBattle.getLibrettoText());
        System.out.println("Текст Либретто спектакля '"+ missionImpossible.getTitle()+"'");
        System.out.println(missionImpossible.getLibrettoText());
    }
}
