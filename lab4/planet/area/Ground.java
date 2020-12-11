package lab4.planet.area;

import lab4.planet.surface.Surface;

import java.util.Objects;

public class Ground extends Surface {

    @Override
    public String toString(){
        return "Ground";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
