package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<String>();
    }
    public Vehicle(List<String> list) {
        this.vehicleList = list;
    }

    public void insertData() {
        vehicleList.add("Car 1");
        vehicleList.add("Car 2");
        vehicleList.add("Car 3");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();
        for(String s: this.getVehicleList()) {
            tempList.add(s);
        }
        return new Vehicle(tempList);
    }
}
