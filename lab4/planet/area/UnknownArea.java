package lab4.planet.area;

import lab4.planet.nature.Field;
import lab4.planet.nature.Forest;
import lab4.planet.nature.River;


public class UnknownArea extends Ground {
    private final Field field;
    private final Forest forest;
    private final River river;

    public UnknownArea() {
        field = new Field();
        forest = new Forest();
        river = new River();
    }

    @Override
    public String toString(){
        return "Unknown ground area with " + field + ", " + forest + ", " + river;
    }

}
