package lab4.instruments.clothing.elements;

import lab4.instruments.clothing.Clothing;
import lab4.instruments.clothing.parameters.ClothingColor;
import lab4.instruments.clothing.parameters.ClothingState;

public class Jacket extends Clothing {
    private final ClothingColor clothingColor;
    private final ClothingState clothingState;

    public Jacket(ClothingColor clothingColor, ClothingState clothingState){
        this.clothingColor = clothingColor;
        this.clothingState = clothingState;
    }

    public ClothingColor getClothingColor() {
        return clothingColor;
    }

    public ClothingState getClothingState() {
        return clothingState;
    }

    @Override
    public String toString() {
        return clothingColor + " " + clothingState + " jacket";
    }
}
