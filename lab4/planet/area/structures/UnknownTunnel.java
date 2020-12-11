package lab4.planet.area.structures;

import lab4.planet.surface.Surface;

public class UnknownTunnel extends ReliefForm{
    private String tunnelEnd;

    public class Bottom{
        private final Surface surface;

        public Bottom(Surface surface) {
            this.surface = surface;
        }

        @Override
        public String toString() {
            return surface + " bottom of " + UnknownTunnel.this;
        }
    }

    public void setTunnelEnd(String tunnelEnd){
        this.tunnelEnd = tunnelEnd;
    }

    public String getTunnelEnd(){
        return this + " leads to " + tunnelEnd + ". It's light from somewhere!";
    }

    @Override
    public String toString() {
        return "Unknown Tunnel";
    }
}
