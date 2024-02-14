package org.example;

public class Stena implements Prepiatstvia{
    int hight = 8;

    @Override
    public void didntMakeIt(Creature creature) {
        System.out.println(creature.getName() + " не смог перебраться через стену и выбывает из игры");
    }
}
