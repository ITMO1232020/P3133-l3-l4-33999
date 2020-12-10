package lab4.instruments.clothing.elements;

import lab4.instruments.clothing.Clothing;

public class Pants extends Clothing {
    private boolean stuffInBoots;

    public void setStuffInBoots(boolean stuffInBoots) {
        this.stuffInBoots = stuffInBoots;
    }

    public boolean isStuffInBoots() {
        return stuffInBoots;
    }

    @Override
    public String toString() {
        return "Pants, stuffed in boots: " + stuffInBoots;
    }
}
