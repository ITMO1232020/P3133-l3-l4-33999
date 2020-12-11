package lab4.person.humans;

import lab4.exceptions.NegativeHeightException;
import lab4.exceptions.PayAttentionException;
import lab4.instruments.Radiotelephone;
import lab4.person.EarthHuman;
import lab4.person.Human;
import lab4.planet.area.structures.ReliefForm;
import lab4.planet.atmosphere.sky.Sky;
import lab4.planet.nature.plants.Plant;
import lab4.planet.nature.plants.fruits.Fruit;
import lab4.planet.surface.Ice;
import lab4.planet.surface.IceSurfaceType;
import lab4.planet.surface.Surface;
import lab4.planet.atmosphere.Air;
import lab4.instruments.clothing.Clothing;
import lab4.instruments.parachute.Parachute;

import java.util.Objects;

public class Neznayka extends EarthHuman {
    private Clothing clothing;
    private int appetite = 0;
    private final Back back;
    private final Legs legs;
    private final Eyes eyes;
    private final Heart heart;
    private double height;

    public Neznayka(double height) throws NegativeHeightException {
        back = new Back();
        legs = new Legs();
        eyes = new Eyes();
        heart = new Heart();

        setHeight(height);
    }

    public String admire(){
        return this + " admired the view...";
    }

    public String thinking() {
        return this + " думает...";
    }

    public String sitOn(Surface surface) {
        return this + " садится на " + surface.whatTheSurface();
    }

    public String stepOn(Surface surface){
        return this + " is stepping on " + surface.whatTheSurface();
    }

    public String slipOn(Surface surface){
        return this + " has slipped on " + surface.whatTheSurface();
    }

    public String lookAround() {
        return this + " is looking around...";
    }

    public String moveOn(){
        return this + " is moving on.";
    }

    public String hide(Clothing clothing, Plant plant){
        return this + " hid " + clothing + " under " + plant;
    }

    public String pluckFruit(Fruit fruit){
        return this + " has just plucked " + fruit;
    }

    public String spitOut(Fruit fruit){
        return this + " has just spat out " + fruit;
    }

    public String tryFruit(Fruit fruit){
        appetite += 1;
        return this + " is trying " + fruit;
    }

    public String throwAway(Fruit fruit){
        return this + " has just thrown away " + fruit;
    }

    public String stuffMouth(Fruit fruit){
        return this + " is stuffing his mouth with " + fruit;
    }

    public String hear(Radiotelephone radiotelephone){
        return this + " hears " + radiotelephone.transmitData() + " from " + radiotelephone + "!";
    }

    public String lookForFood(){
        return this + " is looking for food...";
    }

    public String see(Object object){
        return this + " saw " + object;
    }

    public String lookClosely(Object object){
        return this + " looked closely at " + object;
    }

    public String fall(Surface surface){
        return this + " has fallen in " + surface;
    }

    public String lifeGoodbye(){
        return this + " is saying goodbye to his life. :(";
    }

    public String lookAtTheSky(Sky sky){
        return this + " looked at the " + sky;
    }

    public String decide(String thought){
        return this + " decided that " + thought;
    }

    public String comeCloser(Object object){
        return this + " is coming closer to " + object;
    }

    public String payAttentionOnScream(boolean pay, Human human) throws PayAttentionException {
        if(pay){
            return this + " paid attention on " + human + " scream.";
        }
        else{
            throw new PayAttentionException("EXCEPTION! He can't pay attention on " + human + "!!!");
        }
    }

    public String notice(Object object){
        return this + " noticed " + object;
    }

    public String makeSteps(int count){
        return this + " made " + count + " steps...";
    }

    public String help(boolean possibility, Human human){
        if (possibility){
            return this + " can help " + human;
        }
        else{
            return this + " can't help " + human + ":(";
        }
    }

    public String catchOnIce(Ice ice) {
        if (ice.getIceSurfaceType() == IceSurfaceType.ROUGH){
            return this + " caught on " + ice;
        }
        else{
            return this + " can't catch on " + ice;
        }
    }
    public String roll(String destination){
        return this + " is rolling " + destination;
    }

    public String fallOnPlants(Plant plant){
        return this + " has fallen softly on " + plant;
    }

    public String laugh(){
        return this + " is laughing!";
    }

    public String comeIn(ReliefForm reliefForm){    //////////////////////////
        return this + " is coming in " + reliefForm;
    }

    public String comeOut(ReliefForm reliefForm){
        return this + " is coming out of " + reliefForm;
    }

    public String setClothingTakeOn(Clothing clothing){
        this.clothing = clothing;
        return this + back.takeClothingOn(clothing);
    }

    public String setClothingTakeOff(){
        if (clothing != null){
            return this + back.takeClothingOff(clothing);
        }
        return "Nothing to take off";
    }

    public void setHeight(double height) throws NegativeHeightException {
        if (height <= 0){
            throw new NegativeHeightException("ERROR! Height value is impossible!", height);
        }
        this.height = height;
    }

    public int getAppetite(){
        return appetite;
    }

    public double getHeight(){
        return height;
    }

    public String jumpWithParachute(Parachute parachute) {
        printJumpInfo(parachute);
        return this + " " + legs.kneelDown();
    }

    public String breathe(Air air){
        return this + " дышит " + air + ".";
    }

    @Override
    public String toString(){
        return "Neznayka";
    }

    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), back, legs);
    }

    public void printJumpInfo(Parachute parachute){
        System.out.println(this + " прыгает!");
        System.out.println(parachute.open());
        System.out.println(parachute.close());
    }
}
