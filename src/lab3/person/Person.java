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

    public void setClothingTakeOn(Clothing clothing){
        this.clothing = clothing;
        System.out.println(this + back.takeClothingOn(clothing));
    }

    public void setClothingTakeOff(){
        if (clothing != null){
            System.out.println(this + back.takeClothingOff(clothing));
        }
    }

    public void jumpWithParachute(Parachute parachute) {
        printJumpInfo();
        parachute.open();
        parachute.close();
        System.out.println(name + " " + legs.kneelDown());
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

    public void printJumpInfo(){
        System.out.println(name + " прыгает!");
    }
}
