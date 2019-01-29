package com.company;

public class Boat
{
    int smallFish, mediumFish, bigFish;

    public void caughtSmallFish()
    {
        this.smallFish++;
    }
    public void caughtSmallFish(int quantity)
    {
        this.smallFish += quantity;
    }
    //---------------------------------------------
    public void caughtMediumFish()
    {
        this.mediumFish++;
    }
    public void caughtMediumFish(int quantity)
    {
        this.mediumFish += quantity;
    }
    //---------------------------------------------
    public void caughtBigFish()
    {
        this.bigFish++;
    }
    public void caughtBigFish(int quantity)
    {
        this.bigFish += quantity;
    }
    //---------------------------------------------
    public int getTotalWeight()
    {
        final int SMALL_FISH_WEIGHT = 1;
        final int MEDIUM_FISH_WEIGHT = 5;
        final int BIG_FISH_WEIGHT = 10;

        int totalWeight = smallFish * SMALL_FISH_WEIGHT;
        totalWeight += mediumFish * MEDIUM_FISH_WEIGHT;
        totalWeight += bigFish * BIG_FISH_WEIGHT;

        return totalWeight;
    }
    public boolean isCloseToSinking()
    {
        boolean closeToSinking = false;

        if (getTotalWeight() > 200)
        {
            closeToSinking = true;
        }
        return closeToSinking;
    }

    public boolean isSunk()
    {
        boolean sunk = false;

        if (getTotalWeight() > 210)
        {
            sunk = true;
        }
        return sunk;
    }

}
