package lab3.person.instruments;

import lab3.person.Person;

public class SpaceSuit extends Clothing {
    public void takeOn() {
        System.out.println("Надевается скафандр!");
    }

    public void takeOff() {
        System.out.println("Снимается скафандр!");
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
