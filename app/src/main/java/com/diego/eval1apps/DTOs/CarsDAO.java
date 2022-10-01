package com.diego.eval1apps.DTOs;

import com.diego.eval1apps.models.Car;

import java.util.ArrayList;

public class CarsDAO {
    private static final ArrayList<Car> cars = new ArrayList<>();

    public static void initUsers() {
        cars.add(new Car("PBHC45", "Kia", "Morning", "Rojo", "KS939234", "Diego"));
        cars.add(new Car("WZKJ99", "Kia", "Rio 4", "Azul", "UH94598230", "Diego"));
        cars.add(new Car("FGPO12", "Nissan", "Versa", "Blanco", "N90845HG", "Erick"));
        cars.add(new Car("GGYU65", "Mustang", "GT", "Negro", "MT458968G", "Rodrigo"));
        cars.add(new Car("XXZZ66", "Toyota", "Supra", "Rojo", "T94569K95", "Rodrigo"));
    }

    public static void create(Car car) {
        cars.add(car);
    }

    public static void update(Car car) {
        int i = 0;
        for (Car c : cars) {
            if(c.getPatent().equals(car.getPatent())){
                cars.set(i, car);
            }
            i ++;
        }
    }

    public static boolean isValid(Car car){
        boolean valid = false;
        for(Car u : cars){
            if (u.getPatent().equals(car.getPatent())) return false;
        };
        return valid;
    }
}
