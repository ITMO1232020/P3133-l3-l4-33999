package lab4.planet;

import lab4.planet.surface.Surface;
import lab4.planet.atmosphere.Air;

import java.util.Objects;

public abstract class Planet {
    private final Surface surface;
    private final Air air;

    public Planet(Surface surface, Air air){
        this.surface = surface;
        this.air = air;
    }

    public Air getAir(){
        return air;
    }

    public Surface getSurface(){
        return surface;
    }

    @Override
    public boolean equals(Object obj){
        if( obj == null && this.getClass() != obj.getClass()){
            return false;
        }

        Planet planet = (Planet)obj;
        return this.surface.equals(planet.getSurface()) && this.air.equals(planet.getAir());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), surface, air);
    }
}
