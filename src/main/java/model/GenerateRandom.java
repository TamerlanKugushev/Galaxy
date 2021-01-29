package model;

import java.util.Random;

public class GenerateRandom {
    public static int generateInt(int a, int b) {
        Random random = new Random();
        int diff = b - a;
        return random.nextInt(diff) + a;
    }

    public static Planet generatePlanet() {
        Planet planet = new Planet("P" + generateInt(0, Integer.MAX_VALUE),
                (double) generateInt(0, Integer.MAX_VALUE),
                (double) generateInt(0, Integer.MAX_VALUE),
                (double) generateInt(0, Integer.MAX_VALUE));
        return planet;
    }

    public static Planet[] generatePlanets(int n) {
        Planet[] planets = new Planet[n];
        for (int i = 0; i < planets.length; i++) {
            planets[i] = generatePlanet();
        }
        return planets;
    }

    public static Galaxy generateGalaxy() {
        Galaxy galaxy = new Galaxy("G" + generateInt(0, Integer.MAX_VALUE));
        galaxy.addPlanets(generatePlanets(generateInt(1, 20)));
        return galaxy;
    }

    public static Galaxy[] generateGalaxies(int n) {
        Galaxy[] galaxies = new Galaxy[n];
        for (int i = 0; i < galaxies.length; i++) {
            galaxies[i] = generateGalaxy();
        }
        return galaxies;
    }




}
