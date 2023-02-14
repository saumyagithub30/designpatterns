package org.example.prototype;

import java.util.List;

public class PrototypePatternExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle vehicle = new Vehicle();
        vehicle.insertData();

        Vehicle vehicle2 = (Vehicle) vehicle.clone();
        List<String> list = vehicle2.getVehicleList();
        list.add("Car 4");

        System.out.println(vehicle.getVehicleList());
        System.out.println(list);

        vehicle2.getVehicleList().remove("Car 2");
        System.out.println(list);
        System.out.println(vehicle.getVehicleList());
    }
}
