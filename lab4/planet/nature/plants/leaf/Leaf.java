package lab4.planet.nature.plants.leaf;

import lab4.planet.atmosphere.Air;
import lab4.planet.ObjectSize;

import java.util.Objects;

public class Leaf {
    private LeafColour leafColour;
    private ObjectSize objectSize;

    public Leaf(LeafColour leafColour, ObjectSize objectSize){
        this.leafColour = leafColour;
        this.objectSize = objectSize;
    }

    public LeafColour getLeafColour() {
        return leafColour;
    }

    public void setLeafColour(LeafColour leafColour) {
        this.leafColour = leafColour;
    }

    public ObjectSize getLeafSize() {
        return objectSize;
    }

    public void setLeafSize(ObjectSize objectSize) {
        this.objectSize = objectSize;
    }

    public String move(Air air) {
        if (air.getIsMove()) {
            return "Листья колышутся.";
        }
        else{
            return "Листья не колышутся.";
        }
    }

    @Override
    public String toString(){
        return "leaves " + this.getLeafSize() + " и " + this.getLeafColour();
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Leaf leaf = (Leaf)obj;
        return this.getLeafColour() == leaf.getLeafColour() && this.getLeafSize() == leaf.getLeafSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), objectSize, leafColour);
    }
}
