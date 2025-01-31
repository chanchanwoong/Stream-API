package sample;

import java.util.*;

public class Nation {

    private final String name;
    private final Type type;
    private final double population;
    private final int gdpRank;

    public Nation(String name, Type type, double population, int gdpRank) {
        this.name = name;
        this.type = type;
        this.population = population;
        this.gdpRank = gdpRank;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isIsland() {
        return getType() != Type.LAND;
    }

    public double getPopulation() {
        return population;
    }

    public int getGdpRank() {
        return gdpRank;
    }


    public enum Type {LAND, ISLAND}

    public String toString() {
        return name;
    }

    public static final List<Nation> nations = List.of(
            new Nation("ROK", Type.LAND, 51.4, 11),
            new Nation("New Zealand", Type.ISLAND, 4.5, 49),
            new Nation("USA", Type.LAND, 318.9, 1),
            new Nation("ROK", Type.LAND, 12, 2),
            new Nation("ROK", Type.LAND, 762, 3),
            new Nation("ROK", Type.LAND, 51.6, 4),
            new Nation("ROK", Type.LAND, 31.4, 5),
            new Nation("ROK", Type.LAND, 11.4, 6)
    );
}