package lab3.person;

import lab3.nature.Surface;
import lab3.person.instruments.Clothing;
import lab3.person.instruments.parachute.Parachute;
import lab3.nature.*;

import java.util.Objects;

public class Person {
    private final String name;
    private Clothing clothing;
    private final Back back;
    private final Legs legs;

    public Person(String name) {
        this.name = name;
        back = new Back();
        legs = new Legs();
    }

    public String getName(){
        return name;
    }

    public String thinking() {
        return this + " думает...";
    }

    public String sitOn(Surface surface) {
        return name + " садится на " + surface.whatTheSurface();
    }

    public String lookAround() {
        return name + " оглядывается по сторонам...";
    }

    public String setClothingTakeOn(Clothing clothing){
        this.clothing = clothing;
        return this + back.takeClothingOn(clothing);
    }

    public String setClothingTakeOff(){
        if (clothing != null){
            return this + back.takeClothingOff(clothing);
        }
        return "Nothing to take off";
    }

    public String jumpWithParachute(Parachute parachute) {
        printJumpInfo(parachute);
        return name + " " + legs.kneelDown();
    }

    public String breathe(Air air){
        return this + " дышит " + air + ".";
    }

    @Override
    public String toString(){
        return "Человек по имени " + name;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person)obj;
        return this.getName() == person.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, back, legs);
    }

    public void printJumpInfo(Parachute parachute){
        System.out.println(name + " прыгает!");
        System.out.println(parachute.open());
        System.out.println(parachute.close());
    }
}
