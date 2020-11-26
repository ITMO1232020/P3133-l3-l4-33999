package lab3;

import lab3.nature.planet.Earth;
import lab3.nature.planet.Planet;
import lab3.nature.planet.UnknownPlanet;
import lab3.person.Legs;
import lab3.person.Person;
import lab3.person.instruments.*;
import lab3.nature.plants.*;
import lab3.nature.*;
import lab3.person.instruments.parachute.Parachute;
import lab3.person.instruments.parachute.WingedParachute;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Незнайка");
        Parachute parachute = new WingedParachute();
        Clothing clothing = new SpaceSuit();

        Leaf leaf = new Leaf(LeafColour.GREEN, LeafSize.SMALL);
        Bush bush = new Bush(leaf);
        Surface surface = new Ground(bush);
        FreshAir freshAir = new FreshAir();

        Planet unknownPlanet = new UnknownPlanet(surface, freshAir);

        person.setClothingTakeOn(clothing);
        person.jumpWithParachute(parachute);
        person.sitOn(surface);
        person.lookAround();
        leaf.move(freshAir);

        person.thinking();
        freshAir.move();

        person.setClothingTakeOff();
        unknownPlanet.getAir();
        person.breathe(freshAir);


        Air air = new Air();
        Surface earthSurface = new Ground();
        Planet earth = new Earth(earthSurface, air);
        earth.getAir();
    }
}
