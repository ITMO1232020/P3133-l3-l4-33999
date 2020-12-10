package lab4.planet.atmosphere;

import lab4.person.Human;

import java.util.Objects;

public class Air implements Atmosphere {
    protected boolean isMove;

    public Air() {
        isMove = true;
    }

    public String move() {
        Wind wind = new Wind();
        return wind.move();
    }

    public boolean getIsMove() {
        return isMove;
    }

    public void setIsMove(boolean isMove) {
        this.isMove = isMove;
    }

    public class Wind{
        public String move() {
            if (getIsMove()) {
                return this + " is blowing...";
            }
            else{
                return "It's calm, " + this + " isn't blowing.";
            }
        }

        public String carry(Human human, Object object){
            return this + " is carrying " + human + " to " + object;
        }

        @Override
        public String toString() {
            return "Wind";
        }
    }

    public class Fog{
        public String appear(){
            return this + " appeared.";
        }

        public String clear(){
            return this + " cleared.";
        }

        @Override
        public String toString() {
            return "Fog";
        }
    }

    public class Temperature{
        private TemperatureState temperatureState;

        public void setTemperatureState(TemperatureState temperatureState) {
            this.temperatureState = temperatureState;
        }

        public String getTemperatureState() {
            return this + " is " + temperatureState;
        }

        public String decrease(){
            return this + " decreased";
        }

        @Override
        public String toString() {
            return "Temperature";
        }
    }


    @Override
    public String toString(){
        return "Воздух";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Air air = (Air)obj;
        return isMove == air.isMove;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), isMove);
    }
}
