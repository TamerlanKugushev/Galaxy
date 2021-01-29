package model;

import java.util.*;

public class Galaxy {
    private String nameOfGalaxy;
    private ArrayList<Planet> planets = new ArrayList<>();

    public Galaxy() {
    }

    public Galaxy(String nameOfGalaxy) {
        this.nameOfGalaxy = nameOfGalaxy;
    }

    public String getNameOfGalaxy() {
        return nameOfGalaxy;
    }

    public void setNameOfGalaxy(String nameOfGalaxy) {
        this.nameOfGalaxy = nameOfGalaxy;
    }


    public void behaviorGalaxy() {
        for (int i = 0; i < this.planets.size(); i++) {
            this.planets.get(i).behavior();
        }
    }


    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }

    public void addPlanets(Planet[] planetsArr) {
        Collections.addAll(this.planets, planetsArr);
    }


    public Planet search(String nameOfPlanet) {
        for (int i = 0; i < planets.size(); i++) {
            Planet planet = planets.get(i);
            if (planet.getNameOfPlanet().equals(nameOfPlanet)) {
                return planet;
            }
        }
        return null;
    }

    public int search(Planet planet) {
        return this.planets.indexOf(planet);
    }

    public Planet delete(String nameOfPlanet) {
        Planet planet = search(nameOfPlanet);
        if (planet == null)
            return null;
        planets.remove(planet);
        return planet;
    }

    public boolean delete(Planet planet) {
        return planets.remove(planet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galaxy galaxy = (Galaxy) o;
        return nameOfGalaxy.equals(galaxy.nameOfGalaxy) &&
                planets.equals(galaxy.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfGalaxy, planets);
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "nameOfGalaxy='" + nameOfGalaxy + '\'' +
                ", planets=" + planets +
                '}';
    }
}
