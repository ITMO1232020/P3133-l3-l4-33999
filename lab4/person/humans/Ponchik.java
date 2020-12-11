package lab4.person.humans;

import lab4.instruments.clothing.Clothing;
import lab4.instruments.clothing.elements.shoes.Boots;
import lab4.person.EarthHuman;
import lab4.person.Human;

public class Ponchik extends EarthHuman {

    private Boots boots;

    public String stepFollow(Human human){
        return this + " is moving step by step, following " + human;
    }

    public String hop(){
        return this + " is hopping.";
    }

    public String lookForClothing(Clothing clothing){
        return this + " is looking for " + clothing;
    }

    public String getLost(Object obj){               ///////////////////////////////
        return this + " got lost in " + obj;
    }   /////////////////////////

    public String getScared(){
        return this + " got scared!";
    }

    public String call(Human human){
        return this + " is calling " + human;
    }

    public void setBoots(Boots boots){
        this.boots = boots;
    }

    public Boots getBoots() {
        return boots;
    }

    @Override
    public String toString() {
        return "Ponchik";
    }
}
