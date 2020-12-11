package lab4.instruments.clothing.elements;

import lab4.instruments.clothing.Clothing;
import lab4.instruments.clothing.parameters.CleanlinessState;
import lab4.instruments.clothing.parameters.ClothingColor;
import lab4.instruments.clothing.parameters.ClothingLook;

public class Cap extends Clothing {
    private final CleanlinessState cleanlinessState;
    private final ClothingColor clothingColor;
    private final ClothingLook clothingLook;

    public Cap(CleanlinessState cleanlinessState, ClothingColor clothingColor, ClothingLook clothingLook){
        this.cleanlinessState = cleanlinessState;
        this.clothingColor = clothingColor;
        this.clothingLook = clothingLook;
    }

    public CleanlinessState getClothingState() {
        return cleanlinessState;
    }

    public ClothingColor getClothingColor() {
        return clothingColor;
    }

    public ClothingLook getClothingLook() {
        return clothingLook;
    }

    @Override
    public String toString() {
        return clothingColor + " " + cleanlinessState + " " + clothingLook + " cap";
    }
}
