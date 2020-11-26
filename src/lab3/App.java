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

        System.out.println(person.setClothingTakeOn(clothing));
        System.out.println(person.jumpWithParachute(parachute));

        System.out.println(person.sitOn(surface));
        System.out.println(person.lookAround());
        System.out.println(leaf.move(freshAir));

        System.out.println(person.thinking());
        System.out.println(freshAir.move());

        person.setClothingTakeOff();
        System.out.println(person.breathe(freshAir));
    }
}
