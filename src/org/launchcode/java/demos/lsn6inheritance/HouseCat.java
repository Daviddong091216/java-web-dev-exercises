package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    //constructor --with all(two) parameters
    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName) {
        name = aName;
    }

    //new method
    public boolean isSatisfied() {
        //isHungry and isTired are public getter(method) in Cat class
        return !isHungry() && !isTired();
    }

    @Override//override the method in Cat class
    public String noise() {
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise();
        }

    }
    public void noise(String str) {
        System.out.println(str);
    }

    //new method
    public String purr() {
        return "I'm a HouseCat";
    }
}
