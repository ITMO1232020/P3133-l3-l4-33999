package lab4.planet.area.city;

import lab4.planet.ObjectSize;

public class BoardFence {
    private final ObjectSize objectSize;


    public BoardFence(ObjectSize objectSize) {
        this.objectSize = objectSize;
    }

    public ObjectSize getObjectSize() {
        return objectSize;
    }

    @Override
    public String toString() {
        return objectSize + " board fence";
    }
}
