package me.dio.model;

import java.util.Objects;

public
class Car implements Comparable<Car> {
    private String brand;

    public
    Car (String brand) {
        this.brand = brand;
    }

    public
    String getBrand ( ) {
        return brand;
    }

    public
    void setBrand (String brand) {
        this.brand = brand;
    }

    @Override
    public
    boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash(brand);
    }

    @Override
    public
    String toString ( ) {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public
    int compareTo (Car o) {
        return this.getBrand().compareTo(o.getBrand());
        /*
        return (this.brand.length() < o.brand.length())? -1:
                (this.brand.length() > o.brand.length())? 1:
                0;
         */
    }
}
