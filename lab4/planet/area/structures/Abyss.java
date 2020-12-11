package lab4.planet.area.structures;

public class Abyss extends ReliefForm{

    public class Wall{
        public String goSides(){
            return this + " went to the sides...";
        }

        public String disappear(){
            return this + " disappeared!";
        }

        @Override
        public String toString() {
            return Abyss.this.toString() + " wall";
        }
    }

    @Override
    public String toString() {
        return "Abyss";
    }
}
