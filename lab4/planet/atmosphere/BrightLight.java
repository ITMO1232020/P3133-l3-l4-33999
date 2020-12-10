package lab4.planet.atmosphere;

import lab4.person.Human;

public class BrightLight {

    public String hurtEyes(Human human){
        return this + " hurts " + human + " eyes!";
    }

    @Override
    public String toString() {
        return "Bright light";
    }
}
