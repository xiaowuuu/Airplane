package org.example.Flight;

public enum PlaneType {
    GLIDER (200, 400),
    AIRLINER(300, 600),
    BOEING767(400, 800);


    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    PlaneType(int capacity, int totalWeight) {

        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }


    private final int capacity;
    private final int totalWeight;

}
