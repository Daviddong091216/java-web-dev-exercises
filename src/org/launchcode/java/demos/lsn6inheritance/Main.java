package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat spike = new HouseCat("Spike");
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
//        garfield.eat1();
//        Cat.eat1();
        garfield.eat2();//it works , but it is bad pattern to use "static" method
        Cat.eat2();
        System.out.println(garfield.isTired());
        System.out.println(garfield.isHungry());
        System.out.println(garfield.isSatisfied());

//        HouseCat mittens = new HouseCat(8.4);
//        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
        Cat plainCat = new Cat(8.6);
        System.out.println(plainCat.noise());
        System.out.println(spike.noise());
        spike.noise("kkkkkkkkkk");

        Cat suki = new HouseCat("Suki", 8);
        Cat suki1 = new Cat();

        System.out.println(suki.noise());
        System.out.println(((HouseCat)suki).isSatisfied());
        System.out.println(((HouseCat)suki1).isSatisfied());
//        System.out.println(suki.isSatisfied());
        System.out.println(suki1.noise());
        System.out.println(suki1.noise());

    }
}
