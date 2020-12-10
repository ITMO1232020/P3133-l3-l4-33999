package lab4.planet.nature.plants.fruits;

public class Raspberry extends Fruit{

    public Raspberry(FruitOrigin fruitOrigin){
        super(fruitOrigin);
    }

    @Override
    public String toString() {
        return getFruitColor() + " " + getFruitSize() + " raspberry from " + getFruitOrigin();
    }
}
