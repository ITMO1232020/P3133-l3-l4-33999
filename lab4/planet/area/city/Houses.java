package lab4.planet.area.city;

import lab4.planet.nature.plants.Plant;

public class Houses {

    public String roofInGreenery(Plant plant){
        class Roof{
            public String buriedInGreenery() {
                return this + " is buried in " + plant;
            }

            @Override
            public String toString() {
                return "Roofs";
            }
        }

        Roof roof = new Roof();
        return this + " " + roof.buriedInGreenery();
    }

    @Override
    public String toString() {
        return "Houses";
    }
}
