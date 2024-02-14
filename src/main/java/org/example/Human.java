package org.example;

public class Human extends Creature {

    public Human(String name, int stamina, int highjump) {
        super(name, stamina, highjump);
    }

    @Override
    public boolean run(int distance) {
        if(distance > stamina)
        {
            System.out.println(name + " не пробежал дистанцию " + distance);
            return false;
        }
        else {
            System.out.println(name + " пробежал дистанцию " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int distance) {
        if(distance > highjump)
        {
            System.out.println(name + " не перелез стену " + distance);
            return false;
        }
        else {
            System.out.println(name + " перелез через стену " + distance);
            return true;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

