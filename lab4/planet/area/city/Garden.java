package lab4.planet.area.city;

import lab4.planet.area.Ground;
import lab4.planet.nature.plants.Plant;
import lab4.planet.nature.plants.bush.Bush;

public class Garden extends Ground {
    private Plant plant;

    public Garden() {
        plant = new Bush();
    }

    public Garden(Plant plant){
        this();
        this.plant = plant;
    }

    public Plant getPlant(){
        return plant;
    }

    @Override
    public String toString(){
        return "Unknown ground area with " + plant.toString();
    }
}
