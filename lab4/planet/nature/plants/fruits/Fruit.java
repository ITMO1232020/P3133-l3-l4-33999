package lab4.planet.nature.plants.fruits;

import lab4.planet.ObjectSize;

public abstract class Fruit {
    private FruitTaste fruitTaste;
    private FruitColor fruitColor;
    private FruitOrigin fruitOrigin;
    private ObjectSize objectSize;

    public Fruit(){
        fruitColor = FruitColor.UNKNOWN;
        fruitOrigin = FruitOrigin.UNKNOWN;
        fruitTaste = FruitTaste.UNKNOWN;
    }

    public Fruit(FruitOrigin fruitOrigin) {
        this();
        this.fruitOrigin = fruitOrigin;
    }

    public void setFruitTaste(FruitTaste fruitTaste) {
        this.fruitTaste = fruitTaste;
    }

    public void setFruitColor(FruitColor fruitColor) {
        this.fruitColor = fruitColor;
    }

    public void setFruitSize(ObjectSize objectSize) {
        this.objectSize = objectSize;
    }

    public FruitOrigin getFruitOrigin() {
        return fruitOrigin;
    }

    public FruitColor getFruitColor() {
        return fruitColor;
    }

    public ObjectSize getFruitSize() {
        return objectSize;
    }

    public FruitTaste getFruitTaste() {
        return fruitTaste;
    }
}
