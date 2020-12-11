package lab4.planet;

import lab4.planet.surface.Surface;
import lab4.planet.atmosphere.Air;

public class Moon extends Planet{

    public Moon(Surface surface, Air air){
        super(surface, air);
    }

    public class Deep{
        @Override
        public String toString() {
            return Moon.this + " deep";
        }
    }


    @Override
    public String toString(){
        return "The Moon";
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
