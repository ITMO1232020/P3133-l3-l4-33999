package lab4.planet.area.structures;

import lab4.planet.surface.Surface;

public class Column {
    private final Surface surface;

    public Column(Surface surface){
        this.surface = surface;
    }

    public Surface getMaterial() {
        return surface;
    }

    @Override
    public String toString() {
        return surface + " columns";
    }
}
