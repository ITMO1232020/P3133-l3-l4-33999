package lab4.planet;

import lab4.planet.surface.Surface;
import lab4.planet.atmosphere.Air;

public class Earth extends Planet{
    public Earth(Surface surface, Air air){
        super(surface, air);
    }

    @Override
    public String toString(){
        return "The Earth";
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
