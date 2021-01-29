package model;

import java.util.*;

public class Universe {
    private ArrayList<Galaxy> galaxies = new ArrayList<>();

    public Universe() {
    }

    public void addGalaxy(Galaxy galaxy) {
        this.galaxies.add(galaxy);
    }

    public Galaxy searchGalaxy(String nameOfGalaxy) {
        for (int i = 0; i <= galaxies.size(); i++) {
            Galaxy galaxy = galaxies.get(i);
            if (galaxy.getNameOfGalaxy().equals(nameOfGalaxy)) {
                return galaxy;
            }
        }
        return null;
    }

    public int search(Galaxy galaxy) {
        return galaxies.indexOf(galaxy);
    }

    public Planet searchPlanet(String nameOfPlanet) {
        for (int i = 0; i < galaxies.size(); i++) {
            Planet planet = galaxies.get(i).search(nameOfPlanet);
            if (planet != null) {
                return planet;
            }
        }
        return null;
    }

    //вернуть в виде массива из двух элементов
    // индекс галактики где находится планета и индекс самой планеты в этой галактике
    public int[] searchPlanet(Planet planet) {
        for (int i = 0; i < galaxies.size(); i++) {
            int indexOfPlanet = galaxies.get(i).search(planet);
            if (indexOfPlanet != -1) {
                return new int[]{i, indexOfPlanet};
            }
        }
        return new int[]{-1, -1};
    }

    public void behaviorUniverse() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Universe.this.galaxies.addAll(Arrays.asList(GenerateRandom.generateGalaxies(20)));
                System.out.println(Universe.this.toString());
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 30000);

    }

    @Override
    public String toString() {
        return "Universe{" +
                "galaxies=" + galaxies +
                '}';
    }
}
