package lab4.planet.area.city;

import lab4.planet.surface.Pavement;
import lab4.planet.surface.Surface;

public class Streets {
    private final Surface surface;

    public Streets() {
        surface = new Pavement();
    }

    @Override
    public String toString() {
        return "Streets with " + surface;
    }
}
