package lab4.instruments.clothing.elements.shoes;

public class SpaceBoots extends Boots{

    public String fly(){
        return this + " flew away.";
    }

    @Override
    public String toString() {
        return "Space boots";
    }
}
