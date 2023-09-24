package org.example;

public class Passenger extends PersonName{
    private int numOfBags;
    public Passenger(String name, int numOfBags) {
        super(name);
        this.numOfBags = numOfBags;
    }
    public int getNumOfBags() {
        return numOfBags;
    }
    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }
}
