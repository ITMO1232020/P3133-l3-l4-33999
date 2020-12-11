package lab4.person;

import lab4.instruments.clothing.Clothing;
import lab4.person.parameters.EyesLookType;
import lab4.person.parameters.HeartBeat;
import lab4.person.parameters.SoulState;

public abstract class Human {
    public class Back{
        public String takeClothingOn(Clothing clothing){
            return " is taking on  " + clothing + ".";
        }

        public String takeClothingOff(Clothing clothing){
            return " is taking off " + clothing + ".";
        }

        @Override
        public String toString(){
            return "Back";
        }

        @Override
        public boolean equals(Object obj) {
            return obj != null && this.getClass() == obj.getClass();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    public class Eyes {
        private EyesLookType eyesLookType;

        public void setEyesType(EyesLookType eyesLookType){
            this.eyesLookType = eyesLookType;
        }

        public EyesLookType getEyesType(){
            return eyesLookType;
        }
    }

    public class Head {
        private Clothing clothing;

        public void setClothing(Clothing clothing){
            this.clothing = clothing;
        }

        public Clothing getClothing(){
            return clothing;
        }
    }

    public class Heart {
        private HeartBeat heartBeat;

        public void setHeartBeat(HeartBeat heartBeat) {
            this.heartBeat = heartBeat;
        }

        public String getHeartBeat() {
            return Human.this + " heart is beating " + heartBeat;
        }
    }

    public class Legs {
        public String kneelDown(){
            return this + " buckled.";
        }

        @Override
        public String toString(){
            return "Legs";
        }

        @Override
        public boolean equals(Object obj) {
            return obj != null && this.getClass() == obj.getClass();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    public class Chest{
        public String breathe(){
            return Human.this + " breathes with full chest";
        }

        @Override
        public String toString() {
            return Human.this + "'s chest";
        }
    }

    public class Bones{
        public String crush(){
            return Human.this + "'s " + this + " crushed!";
        }

        @Override
        public String toString() {
            return "Bones";
        }
    }

    public class Soul{
        private SoulState[] soulStates;

        public void setSoulStates(SoulState... soulStates){
            this.soulStates = soulStates;
        }

        public String getSoulStates(){
            StringBuilder states = new StringBuilder();

            for (SoulState s : soulStates){
                states.append(s).append(" ");
            }
            return Human.this + " soul is " + states.toString();
        }
    }
}
