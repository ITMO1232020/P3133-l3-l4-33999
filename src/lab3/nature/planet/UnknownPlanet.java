package lab3.nature.planet;

import lab3.nature.Air;
import lab3.nature.Surface;

public class UnknownPlanet extends Planet{

    public UnknownPlanet(Surface surface, Air air){
        super(surface, air);
    }

    public String toString(){
        return "Неизвестная планета";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
