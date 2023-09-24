package org.example.Flight;

public enum PlaneType {
    GLIDER ("GLIDER", 200, 400),
    AIRLINER("Airliner", 300, 600),
    BOEING767("Boeing 767", 400, 800);

    public String getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    PlaneType(String planeType, int capacity, int totalWeight) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    private final String planeType;
    private final int capacity;
    private final int totalWeight;

}
