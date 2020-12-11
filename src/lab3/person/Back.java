package lab3.person;

import lab3.person.instruments.*;

public class Back{
    public String takeClothingOn(Clothing clothing){
        return " надевает " + clothing + ".";
    }

    public String takeClothingOff(Clothing clothing){
        return " снимает " + clothing + ".";
    }

    @Override
    public String toString(){
        return "Ноги";
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
