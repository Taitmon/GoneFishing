package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Boat pearl = new Boat();

        pearl.caughtSmallFish(8);
        pearl.caughtMediumFish(9);
        pearl.caughtBigFish(15);
        System.out.println(pearl.smallFish);
        System.out.println(pearl.getTotalWeight());

        System.out.println("The pearl is close to sinking: " + pearl.isCloseToSinking());
        System.out.println("The pearl has sunk: " + pearl.isSunk());

    }
}
