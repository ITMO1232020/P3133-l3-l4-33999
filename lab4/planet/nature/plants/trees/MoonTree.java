package lab4.planet.nature.plants.trees;

import lab4.planet.ObjectSize;
import lab4.planet.nature.plants.fruits.Fruit;

public class MoonTree {
    private final ObjectSize objectSize;
    private final double height;

    public MoonTree(ObjectSize objectSize, double height){
        this.objectSize = objectSize;
        this.height = height*(Math.random()*5 + 15)/10.0;
    }

    public ObjectSize getPlantSize() {
        return objectSize;
    }

    public String getHeight() {
        return toString() + " height is " + height + " sm.";
    }

    public class Branch{
        private Fruit fruit;

        public void setFruit(Fruit fruit) {
            this.fruit = fruit;
        }

        public Fruit getFruit() {
            return fruit;
        }

        @Override
        public String toString() {
            return "Branch with " + fruit + " of " + MoonTree.this;
        }
    }

    @Override
    public String toString() {
        return objectSize + " moon tree";
    }
}
