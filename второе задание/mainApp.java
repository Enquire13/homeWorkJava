package ru.Kolganov_aa.dz1;

public class mainApp {
    public static void main(String[] args) {


    Racetrack Racetrack1 = new Racetrack();
    Racetrack1.dist = 200;

    Wall Wall1 = new Wall();
    Wall1.height = 2;

    Human Human1 = new Human();
    Human1.name = "Человек Андрей";
    Human1.maxDist = 500;
    Human1.maxHigh = 1;

    Robot Robot1 = new Robot();
    Robot1.name = "Робот Иван";
    Robot1.maxDist = 100;
    Robot1.maxHigh = 0;

    Cat Cat1 = new Cat();
    Cat1.name = "Кошка Муся";
    Cat1.maxDist = 700;
    Cat1.maxHigh = 4;


    Cat1.run(Racetrack1.dist);
    Cat1.jump(Wall1.height);

    Human1.run(Racetrack1.dist);
    Human1.jump(Wall1.height);

    Robot1.run(Racetrack1.dist);
    Robot1.jump(Wall1.height);
    }
}
