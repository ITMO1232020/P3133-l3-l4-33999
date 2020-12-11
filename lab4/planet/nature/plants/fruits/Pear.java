package lab4.planet.nature.plants.fruits;

public class Pear extends Fruit{
    private boolean ripe;

    public Pear(FruitOrigin fruitOrigin){
        super(fruitOrigin);
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public boolean getRipe() {
        return ripe;
    }

    @Override
    public String toString() {
        return "Pear from " + getFruitOrigin();
    }
}
