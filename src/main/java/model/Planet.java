package model;

import java.util.Objects;

public class Planet {
    private String nameOfPlanet;
    private double temperature;
    private double rotationalSpeed;
    private double distanceFromTheSun;

    public Planet() {
    }

    public Planet(String nameOfPlanet, double temperature, double rotationalSpeed, double distanceFromTheSun) {
        this.nameOfPlanet = nameOfPlanet;
        this.temperature = temperature;
        this.rotationalSpeed = rotationalSpeed;
        this.distanceFromTheSun = distanceFromTheSun;
    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public void setNameOfPlanet(String nameOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getRotationalSpeed() {
        return rotationalSpeed;
    }

    public void setRotationalSpeed(double rotationalSpeed) {
        this.rotationalSpeed = rotationalSpeed;
    }

    public double getDistanceFromTheSun() {
        return distanceFromTheSun;
    }

    public void setDistanceFromTheSun(double distanceFromTheSun) {
        this.distanceFromTheSun = distanceFromTheSun;
    }


    public String behavior() {
        return "Скорость вращения планеты " + this.getNameOfPlanet() + " равна " + this.getRotationalSpeed() + " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(planet.temperature, temperature) == 0 &&
                Double.compare(planet.rotationalSpeed, rotationalSpeed) == 0 &&
                Double.compare(planet.distanceFromTheSun, distanceFromTheSun) == 0 &&
                nameOfPlanet.equals(planet.nameOfPlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPlanet, temperature, rotationalSpeed, distanceFromTheSun);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "nameOfPlanet='" + nameOfPlanet + '\'' +
                ", temperature=" + temperature +
                ", rotationalSpeed=" + rotationalSpeed +
                ", distanceFromTheSun=" + distanceFromTheSun +
                '}';
    }
}
