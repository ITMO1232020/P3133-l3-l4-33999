package lab4.instruments.clothing.elements;

import lab4.instruments.clothing.Clothing;

public class SpaceSuit extends Clothing {
    public String takeOn() {
        return "Надевается скафандр!";
    }

    public String takeOff() {
        return "Taking off the Space suit carefully!";
    }

    @Override
    public String toString(){
        return "Скафандр";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
