package Shows;

import Persons.Actor;
import Persons.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected double duration;
    protected Director director;
    protected ArrayList<Actor> actorList;
    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actorList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }



    public void getActors(){
    for(Actor actor: actorList){
        System.out.println(actor);
    }
    }
    public void addActor(Actor actorNew){
        if (actorList.contains(actorNew)){
            System.out.println("Актёр "+ actorNew+" уже участвует в спектакле '"+getTitle()+"'");

        } else {
            actorList.add(actorNew);
            System.out.println("Актёр " + actorNew + " добавлен в спектакль '" + getTitle() + "'");
        }

    }

    public void replaceActor(Actor actorNew, String surnameOldActor){
        for(Actor actor: actorList) {
            if (actor.getSurname().equals(surnameOldActor)){
                actorList.remove(actor);
                actorList.add(actorNew);
                System.out.println("Актёр "+actor+
                        " был заменён на актёра "+ actorNew+
                        " в спектакле '"+getTitle()+"'");
                return;
            }
        }
        System.out.println("Актёр с фамилий "+surnameOldActor+" отсутствует!");
    }

}
