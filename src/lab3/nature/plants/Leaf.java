package lab3.nature.plants;

import lab3.nature.Air;
import lab3.person.Person;

import java.util.Objects;

public class Leaf {
    private LeafColour leafColour;
    private LeafSize leafSize;

    public Leaf(LeafColour leafColour, LeafSize leafSize){
        this.leafColour = leafColour;
        this.leafSize = leafSize;
    }

    public LeafColour getLeafColour() {
        return leafColour;
    }

    public void setLeafColour(LeafColour leafColour) {
        this.leafColour = leafColour;
    }

    public LeafSize getLeafSize() {
        return leafSize;
    }

    public void setLeafSize(LeafSize leafSize) {
        this.leafSize = leafSize;
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
        return "листья " + this.getLeafSize() + " и " + this.getLeafColour();
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
        return Objects.hash(super.hashCode(), leafSize, leafColour);
    }
}
