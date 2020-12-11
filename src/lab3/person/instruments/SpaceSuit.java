package lab3.person.instruments;

import lab3.person.Person;

public class SpaceSuit extends Clothing {
    public String takeOn() {
        return "Надевается скафандр!";
    }

    public String takeOff() {
        return "Снимается скафандр!";
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
