package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService srv = new CashbackHackService();

    @Test
    public void shouldConsiderEqualBoundary() {

        int actual = srv.remain(1000);
        int expected = 0;
        System.out.println("To earn points, increase your purchases by " + actual + "p");
        assertEquals(actual, expected);

    }
    @Test
    public void shouldConsiderWhenZero() {

        int actual = srv.remain(0);
        int expected = 1000;
        System.out.println("To earn points, increase your purchases by " + actual + "p");
        assertEquals(actual, expected);

    }

    @Test
    public void shouldConsiderEquivalent() {

        int actual = srv.remain(900);
        int expected = 100;
        System.out.println("To earn points, increase your purchases by " + actual + "p");
        assertEquals(actual, expected);

    }

    @Test
    public void shouldConsiderEquivalent2() {

        int actual = srv.remain(700);
        int expected = 300;
        System.out.println("To earn points, increase your purchases by " + actual + "p");
        assertEquals(actual, expected);

    }
    @Test
    public void shouldConsiderBoundary() {

        int actual = srv.remain(999);
        int expected = 1;
        System.out.println("To earn points, increase your purchases by " + actual + "p");
        assertEquals(actual, expected);

    }

    @Test
    public void shouldConsiderBoundary2() {

        int actual = srv.remain(1);
        int expected = 999;
        System.out.println("To earn points, increase your purchases by " + actual + "p");
        assertEquals(actual, expected);

    }

    @Test

    public void shouldConsiderWhenMoreThousand() {

        int actual = srv.remain(5500);
        int expected = 500;
        System.out.println("To earn points, increase your purchases by " + actual + "p");
        assertEquals(actual, expected);

    }



}