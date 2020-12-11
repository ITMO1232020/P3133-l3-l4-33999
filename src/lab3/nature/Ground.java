package lab3.nature;

import lab3.nature.plants.Bush;
import lab3.nature.plants.Plant;

import java.util.Objects;

public class Ground extends Surface {
    private Plant plant;

    public Ground() {
        plant = new Bush();
    }

    public Ground(Plant plant){
        this();
        this.plant = plant;
    }

    public Plant getPlant(){
        return plant;
    }

    @Override
    public String toString(){
        return "земельная поверхность, растения: " + plant.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Ground ground = (Ground)obj;
        return this.plant.equals(ground.getPlant());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plant);
    }
}
