package lab4.planet.nature.plants.bush;

import lab4.planet.nature.plants.StemType;
import lab4.planet.nature.plants.fruits.Raspberry;

public class RaspberryBush extends Bush {
    private final Raspberry raspberry;
    private final StemType stemType;

    public RaspberryBush(Raspberry raspberry, StemType stemType){
        this.raspberry = raspberry;
        this.stemType = stemType;
    }

    public Raspberry getRaspberry() {
        return raspberry;
    }

    public StemType getStemType() {
        return stemType;
    }

    @Override
    public String toString() {
        return "Raspberry bush with " + raspberry;
    }
}
