package org.example;

public class Robot extends Creature{

    public Robot(String name, int stamina, int highjump) {
        super(name, stamina, highjump);
    }

    @Override
    public boolean run(int distance) {
        if(distance > stamina)
        {
            System.out.println(name + " не проехал дистанцию " + distance);
            return false;
        }
        else {
            System.out.println(name + " проехал дистанцию " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int distance) {
        if(distance > highjump)
        {
            System.out.println(name + " не перелетел дистанцию " + distance);
            return false;
        }
        else {
            System.out.println(name + " перелетел дистанцию " + distance);
            return true;
        }
    }
    @Override
    public String getName() {
        return name;
    }
}

