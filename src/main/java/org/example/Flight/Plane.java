package org.example.Flight;

public class Plane {
    private PlaneType planeType;

    public PlaneType getPlaneType() {
        return planeType;
    }

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public int getPlaneCapacity(){
        return this.planeType.getCapacity();
    }
    public  int getTotalWeight(){
        return this.planeType.getTotalWeight();
    }



}
