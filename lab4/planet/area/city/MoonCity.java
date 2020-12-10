package lab4.planet.area.city;

public class MoonCity {
    private final String name;
    private final Streets streets;
    private final Houses houses;
    private final Square square;
    private final Pedestrians pedestrians;

    public MoonCity(String name){
        this.name = name;
        streets = new Streets();
        houses = new Houses();
        square = new Square();
        pedestrians = new Pedestrians();
    }

    public Streets getStreets() {
        return streets;
    }

    public Houses getHouses() {
        return houses;
    }

    public Square getSquare() {
        return square;
    }

    public Pedestrians getPedestrians() {
        return pedestrians;
    }

    public class CityCenter{
        @Override
        public String toString() {
            return "Downtown of " + name;
        }
    }

    public class Outskirts{
        private final Garden garden;
        private final Kailyard kailyard;

        public Outskirts(Garden garden, Kailyard kailyard){
            this.garden = garden;
            this.kailyard = kailyard;
        }

        public Garden getGarden() {
            return garden;
        }

        public Kailyard getKailyard() {
            return kailyard;
        }

        @Override
        public String toString() {
            return "Outskirts of " + name;
        }
    }

    @Override
    public String toString() {
        return "Moon city " + name + " with " + streets + " and " + square;
    }
}
