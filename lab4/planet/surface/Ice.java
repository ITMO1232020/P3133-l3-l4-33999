package lab4.planet.surface;

public class Ice extends Surface{
    private IceSurfaceType iceSurfaceType;

    public void setIceSurfaceType(IceSurfaceType iceSurfaceType) {
        this.iceSurfaceType = iceSurfaceType;
    }

    public IceSurfaceType getIceSurfaceType() {
        return iceSurfaceType;
    }

    @Override
    public String toString() {
        return iceSurfaceType + " ice";
    }
}
