package org.example;

public abstract class Creature{
    String name;
    int stamina;
    int highjump;

    public Creature(String name, int stamina, int highjump) {
        this.name = name;
        this.stamina = stamina;
        this.highjump = highjump;
    }

    public abstract boolean run(int distance);

    public abstract boolean jump(int distance);

    public String getName() {
        return name;
    }
}
