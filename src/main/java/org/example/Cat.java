package org.example;

public class Cat extends Creature {
    public Cat(String name, int stamina, int highjump) {
        super(name, stamina, highjump);
    }
    @Override
    public boolean run(int distance) {
        if(distance > stamina)
        {
            System.out.println(name + " не добежал до дистанции " + distance);
            return false;
        }
        else {
            System.out.println(name + " добежал дистанцию " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int distance) {
        if(distance > highjump)
        {
            System.out.println(name + " не перепрыгнул дистанцию " + distance);
            return false;
        }
        else {
            System.out.println(name + " перепрыгнул дистанцию " + distance);
            return true;
        }
    }
    @Override
    public String getName() {
        return name;
    }
}