package lab4;

import lab4.exceptions.NegativeHeightException;
import lab4.exceptions.PayAttentionException;
import lab4.instruments.Broom;
import lab4.instruments.Radiotelephone;
import lab4.instruments.Time;
import lab4.instruments.clothing.elements.Cap;
import lab4.instruments.clothing.elements.Jacket;
import lab4.instruments.clothing.elements.Pants;
import lab4.instruments.clothing.elements.shoes.Sandals;
import lab4.instruments.clothing.elements.shoes.SpaceBoots;
import lab4.instruments.clothing.parameters.CleanlinessState;
import lab4.instruments.clothing.parameters.ClothingColor;
import lab4.instruments.clothing.parameters.ClothingLook;
import lab4.instruments.clothing.parameters.ClothingState;
import lab4.person.*;
import lab4.person.acts.DoVoice;
import lab4.person.acts.Freeze;
import lab4.person.humans.Fix;
import lab4.person.humans.Ponchik;
import lab4.person.parameters.*;
import lab4.planet.area.*;
import lab4.planet.area.city.*;
import lab4.planet.area.structures.*;
import lab4.planet.atmosphere.Air;
import lab4.planet.atmosphere.BrightLight;
import lab4.planet.atmosphere.FreshAir;
import lab4.planet.Moon;
import lab4.planet.atmosphere.TemperatureState;
import lab4.planet.atmosphere.sky.CloudType;
import lab4.planet.atmosphere.sky.Sky;
import lab4.planet.atmosphere.sky.SkyColor;
import lab4.planet.nature.plants.Greenery;
import lab4.planet.nature.plants.StemType;
import lab4.planet.nature.plants.bush.Bush;
import lab4.planet.nature.plants.bush.RaspberryBush;
import lab4.planet.nature.plants.fruits.*;
import lab4.planet.nature.plants.leaf.Leaf;
import lab4.planet.nature.plants.leaf.LeafColour;
import lab4.planet.ObjectSize;
import lab4.planet.nature.plants.trees.AppleMoonTree;
import lab4.planet.nature.plants.trees.PearMoonTree;
import lab4.planet.surface.Ice;
import lab4.planet.surface.IceSurfaceType;
import lab4.person.humans.Neznayka;
import lab4.instruments.clothing.elements.SpaceSuit;
import lab4.instruments.parachute.Parachute;
import lab4.instruments.parachute.WingedParachute;

public class App {
    public static void main(String[] args) throws PayAttentionException {
        Neznayka neznayka = new Neznayka(1.8);

        try{
            neznayka.setHeight(-3);
        }catch(NegativeHeightException negativeHeightException){
            System.out.println(negativeHeightException.getMessage() + "\nYour value is: " + negativeHeightException.getHeight());
        }


        Ponchik ponchik = new Ponchik();
        IceMasses iceMasses = new IceMasses(ObjectSize.HUGE);

        Air air = new Air();
        Air.Temperature temperature = air.new Temperature();

        SpaceBoots spaceBoots = new SpaceBoots();

        Ice ice = new Ice();
        ice.setIceSurfaceType(IceSurfaceType.SMOOTH);

        Column column = new Column(ice);
        Grotto grotto = new Grotto();

        UnknownTunnel unknownTunnel = new UnknownTunnel();
        UnknownTunnel.Bottom bottom = unknownTunnel.new Bottom(ice);

        Radiotelephone radiotelephone = new Radiotelephone();
        DoVoice doVoice = new DoVoice() {
            @Override
            public String scream(Human human) {
                return human + " is screaming!";
            }
        };
        radiotelephone.receiveData(doVoice.scream(ponchik));

        Leaf leaf = new Leaf(LeafColour.GREEN, ObjectSize.SMALL);
        Bush bush = new Bush(leaf);
        Garden garden = new Garden(bush);
        Kailyard kailyard = new Kailyard();

        FreshAir freshAir = new FreshAir();

        Moon moon = new Moon(garden, freshAir);
        Moon.Deep deep = moon.new Deep();

        Abyss abyss = new Abyss();
        Sky sky = new Sky();
        sky.setSkyColor(SkyColor.LIGHT);
        Sky.Cloud cloud = sky.new Cloud(CloudType.WAVY);

        UnknownArea unknownArea = new UnknownArea();
        MoonCity moonCity = new MoonCity("Davilon");

        Air.Wind wind = air.new Wind();
        MoonCity.Outskirts outskirts = moonCity.new Outskirts(garden, kailyard);

        Houses house = new Houses();
        Greenery greenery = new Greenery();

        Parachute parachute = new WingedParachute();
        SpaceSuit spaceSuit = new SpaceSuit();

        Human.Chest chest = neznayka.new Chest();
        Human.Heart heart = neznayka.new Heart();

        AppleMoonTree appleMoonTree = new AppleMoonTree(ObjectSize.TINY, neznayka.getHeight());
        Apple apple = new Apple(FruitOrigin.MOON);
        apple.setFruitSize(ObjectSize.TINY);
        apple.setFruitTaste(FruitTaste.SOUR);
        apple.setFruitColor(FruitColor.GREEN);

        AppleMoonTree.Branch appleBranch = appleMoonTree.new Branch();
        appleBranch.setFruit(apple);

        PearMoonTree pearMoonTree = new PearMoonTree(ObjectSize.TINY, neznayka.getHeight());
        Pear pear = new Pear(FruitOrigin.MOON);
        pear.setFruitTaste(FruitTaste.TART);
        pear.setRipe(true);

        PearMoonTree.Branch pearBranch = pearMoonTree.new Branch();
        pearBranch.setFruit(pear);

        Jacket jacket = new Jacket(ClothingColor.REDHEAD, ClothingState.WORN);
        ClothingState.WORN.setProblems("on the elbows");
        Cap cap = new Cap(CleanlinessState.DIRTY, ClothingColor.REDHEAD, ClothingLook.RIDICULOUS);
        Pants pants = new Pants();
        pants.setStuffInBoots(false);
        Sandals sandals = new Sandals();

        Fix fix = new Fix(jacket, cap, sandals, pants);
        Fix.Eyes eyes = fix.new Eyes();
        eyes.setEyesType(EyesLookType.ATTENTIVE);

        Broom broom = new Broom();



        ponchik.setBoots(spaceBoots);

        System.out.println(neznayka.admire());
        System.out.println(neznayka.moveOn());
        System.out.println(ponchik.stepFollow(neznayka));
        System.out.println(iceMasses);
        System.out.println(temperature.decrease());

        Freeze freeze = new Freeze() {
            @Override
            public String freeze(Human human) {
                return human + " is freezing even more!";
            }
        };
        System.out.println(freeze.freeze(ponchik));

        System.out.println(ponchik.hop());
        System.out.println(ponchik.getBoots().fly());
        System.out.println(ponchik.lookForClothing(spaceBoots));
        System.out.println(ponchik.getLost(column));
        System.out.println(ponchik.getScared());
        System.out.println(ponchik.call(neznayka));
        System.out.println(neznayka.help(false, ponchik));
        System.out.println(neznayka.comeOut(grotto));
        System.out.println(neznayka.comeIn(unknownTunnel));
        System.out.println(bottom);
        System.out.println(neznayka.stepOn(ice));
        System.out.println(neznayka.slipOn(ice));
        System.out.println(neznayka.roll("down"));
        System.out.println(ice);
        System.out.println(neznayka.catchOnIce(ice));
        System.out.println(neznayka.hear(radiotelephone));

        try{
            System.out.println(neznayka.payAttentionOnScream(false, ponchik));
        }catch(PayAttentionException payAttentionException){
            System.out.println(payAttentionException.getMessage());
        }

        unknownTunnel.setTunnelEnd(deep.toString());
        System.out.println(unknownTunnel.getTunnelEnd());
        System.out.println(neznayka.fall(abyss));

        temperature.setTemperatureState(TemperatureState.WARM);
        System.out.println(temperature.getTemperatureState());
        Time.MINUTE.setCount("2");
        System.out.println(Time.MINUTE.getCount() + " passed.");
        temperature.setTemperatureState(TemperatureState.HOT);
        System.out.println(temperature.getTemperatureState());


        BrightLight brightLight = new BrightLight();
        System.out.println(brightLight.hurtEyes(neznayka));
        System.out.println(neznayka.decide("He would die in fire"));
        System.out.println(neznayka.lifeGoodbye());

        Abyss.Wall wall = abyss.new Wall();
        System.out.println(wall.goSides());
        System.out.println(wall.disappear());

        Time.MINUTE.setCount("1");
        System.out.println(Time.MINUTE.getCount() + " passed.");
        System.out.println(neznayka.lookAtTheSky(sky) + ", and there are " + cloud);

        Air.Fog fog = air.new Fog();
        System.out.println(fog.appear());
        System.out.println(fog.clear());

        System.out.println(neznayka.see(unknownArea));
        System.out.println(neznayka.comeCloser(unknownArea));
        System.out.println(neznayka.see(moonCity));
        System.out.println(neznayka.see(moonCity.getHouses()) + " and " + neznayka.see(moonCity.getPedestrians()));

        System.out.println(wind.carry(neznayka, outskirts));
        System.out.println(neznayka.see(outskirts.getGarden()));
        System.out.println(neznayka.see(outskirts.getKailyard()));
        System.out.println(neznayka.see(outskirts.getGarden()));

        System.out.println(house.roofInGreenery(greenery));

        System.out.println(neznayka.setClothingTakeOn(spaceSuit));
        System.out.println(neznayka.jumpWithParachute(parachute));


        System.out.println(neznayka.sitOn(garden));
        System.out.println(neznayka.lookAround());
        System.out.println(leaf.move(freshAir));

        System.out.println(neznayka.thinking());
        System.out.println(freshAir.move());

        neznayka.setClothingTakeOff();
        System.out.println(neznayka.breathe(freshAir));

        System.out.println(chest.breathe());
        heart.setHeartBeat(HeartBeat.CALM);
        System.out.println(heart.getHeartBeat());

        Neznayka.Soul soul = neznayka.new Soul();
        soul.setSoulStates(SoulState.FUNNY, SoulState.EASY);
        System.out.println(soul.getSoulStates());

        System.out.println(neznayka.lookAround());
        System.out.println(neznayka.thinking());
        System.out.println(spaceSuit.takeOff());
        System.out.println(neznayka.hide(spaceSuit, bush));

        System.out.println(neznayka.lookClosely(bush));
        System.out.println(neznayka.lookClosely(appleMoonTree));
        System.out.println(neznayka.lookClosely(appleBranch));
        System.out.println("Appetite before fruits: " + neznayka.getAppetite());


        System.out.println(neznayka.pluckFruit(apple));
        System.out.println(neznayka.tryFruit(apple));
        System.out.println(neznayka.spitOut(apple));

        System.out.println(neznayka.tryFruit(pear));
        System.out.println(neznayka.tryFruit(pear));
        System.out.println(neznayka.throwAway(pear));

        System.out.println("Appetite after fruits: " + neznayka.getAppetite());
        System.out.println(neznayka.lookForFood());
        Time.HOUR.setCount("many");
        System.out.println(Time.HOUR.getCount() + " passed since he had eaten sth");
        System.out.println(neznayka.makeSteps(2));

        BoardFence boardFence = new BoardFence(ObjectSize.BIG);
        System.out.println(boardFence);

        Raspberry raspberry = new Raspberry(FruitOrigin.MOON);
        raspberry.setFruitSize(ObjectSize.TINY);
        raspberry.setFruitColor(FruitColor.RED);
        RaspberryBush raspberryBush = new RaspberryBush(raspberry, StemType.SPIKY);
        System.out.println(raspberryBush);
        System.out.println(neznayka.tryFruit(raspberry));
        System.out.println(neznayka.stuffMouth(raspberry));

        System.out.println(neznayka.notice(fix));
        System.out.println(fix.keepReady(broom));
    }
}
