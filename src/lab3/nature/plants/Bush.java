package lab3.nature.plants;

import java.util.Objects;

public class Bush extends Plant {
    private final Leaf leaf;

    public Bush() {
        leaf = new Leaf(LeafColour.GREEN, LeafSize.SMALL);
    }

    public Bush(Leaf leaf) {
        this();
        this.leaf.setLeafColour(leaf.getLeafColour());
        this.leaf.setLeafSize(leaf.getLeafSize());
    }

    public Leaf getLeaf(){
        return leaf;
    }

    @Override
    public String toString(){
        return "куст с " + leaf.toString();
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Bush bush = (Bush)obj;
        return leaf.equals(bush.getLeaf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), leaf.getLeafColour());
    }
}
