package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.*;

public class HouseCatTest {
    HouseCat keyboardCat;
    @Before
    public void objectSet() {
        keyboardCat = new HouseCat("keyboard cat", 7);
    }

    @Test
    public void inheritsSuperInFirstConstructor(){
        assertEquals(7, keyboardCat.getWeight(),0.001);
    }
    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(66,keyboardCat.getWeight(),0.001);
    }

    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
    }

}
