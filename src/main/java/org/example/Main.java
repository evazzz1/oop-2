package org.example;
//Домашнее задание на закрепление :
//
//1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса
// но есть общий класс родитель. Эти классы должны уметь бегать и прыгать,
// все также с выводом информации о действии в консоль.

//2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.

//3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//списку он препятствий не идет.


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("коля", 10,10);
        Cat cat = new Cat("барсик",15,20);
        Robot robot = new Robot("robo",30,5);
        Creature [] mass = {human,cat,robot};

        Prepiatstvia [] prep = {new Road(),new Stena()};

        for (Creature creature : mass) {
            boolean goFurther = false;
            for (Prepiatstvia prepiatstvia : prep) {
                if (prepiatstvia instanceof Road) {
                    if (creature.run(((Road) prepiatstvia).length)) goFurther = true;
                    else prepiatstvia.didntMakeIt(creature);

                } else if (prepiatstvia instanceof Stena && goFurther) {
                    if (creature.jump(((Stena) prepiatstvia).hight)) break;
                    else prepiatstvia.didntMakeIt(creature);
                }
            }
        }
    }
}