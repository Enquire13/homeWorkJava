package ru.Kolganov_aa.dz1;

public class mainApp {
    public static void main(String[] args) {
    Human Human1 = new Human();
    Human1.name = "Человек Андрей";

    Robot Robot1 = new Robot();
    Robot1.name = "Робот Иван";

    Cat Cat1 = new Cat();
    Cat1.name = "Кошка Муся";

    Human1.run();
    Human1.jump();
    Robot1.run();
    Robot1.jump();
    Cat1.run();
    Cat1.jump();

    }
}
