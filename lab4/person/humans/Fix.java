package lab4.person.humans;

import lab4.instruments.clothing.Clothing;
import lab4.person.MoonHuman;

public class Fix extends MoonHuman {
    private final Clothing[] clothing;
    private final Head head;

    public Fix(Clothing ... clothing){
        this.clothing = clothing;
        head = new Head();
    }

    public String keepReady(Object object){
        return "Fix is keeping " + object + " at the ready";
    }

    public String attackWith(Object object){
        return this + " is attacking with " + object;
    }

    public Clothing[] getClothing() {
        return clothing;
    }

    @Override
    public String toString() {
        StringBuilder clothings = new StringBuilder();
        for (Clothing c : clothing){
            clothings.append(c).append(" ");
        }
        return "Fix in " + clothings;
    }
}
