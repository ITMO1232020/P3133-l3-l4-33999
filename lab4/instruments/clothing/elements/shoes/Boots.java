package lab4.instruments.clothing.elements.shoes;

import lab4.instruments.clothing.Clothing;

public class Boots extends Clothing {
    public String fly(){
        return this + " flew away!";
    }

    @Override
    public String toString() {
        return "Boots";
    }
}
