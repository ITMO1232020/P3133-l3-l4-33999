package lab4.planet.area.structures;

import lab4.planet.ObjectSize;

public class IceMasses {
    private final ObjectSize objectSize;


    public IceMasses(ObjectSize objectSize) {
        this.objectSize = objectSize;
    }

    public ObjectSize getObjectSize() {
        return objectSize;
    }

    @Override
    public String toString() {
        return objectSize + " masses of ice";
    }
}
