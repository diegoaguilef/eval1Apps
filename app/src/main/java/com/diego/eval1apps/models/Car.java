package com.diego.eval1apps.models;

public class Car {
    private String model, color, serialNumber, owner, brand, patent;

    public Car() {
    }

    public Car(String patent, String brand, String model, String color, String serialNumber, String owner) {
        this.patent = patent;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.owner = owner;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", owner='" + owner + '\'' +
                ", brand='" + brand + '\'' +
                ", patent='" + patent + '\'' +
                '}';
    }
}
