package lab4.planet.atmosphere.sky;

public class Sky {
    public SkyColor skyColor;

    public Sky() {
        skyColor = SkyColor.LIGHT;
    }

    public void setSkyColor(SkyColor skyColor) {
        this.skyColor = skyColor;
    }

    public SkyColor getSkyColor() {
        return skyColor;
    }

    public class Cloud{
        private final CloudType cloudType;


        public Cloud(CloudType cloudType) {
            this.cloudType = cloudType;
        }

        public CloudType getCloudType() {
            return cloudType;
        }

        @Override
        public String toString() {
            return cloudType + " cloud";
        }
    }

    @Override
    public String toString() {
        return skyColor + " sky";
    }
}
