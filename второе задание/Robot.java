package ru.Kolganov_aa.dz1;

public class Robot {
    String name;
    int maxDist;
    int maxHigh;

    public void run(int dist) {
        if (dist<maxDist)
        System.out.println("ДА! " + name + " осилил дистанцию.");
        else {
            System.out.println("У робота Ивана не получилось :(" );
        }
    }

    public void jump(int height) {
        if (height<maxHigh)
        System.out.println(name + " перыгнул препятствие! Невероятно!");
        else {
            System.out.println("К сожалению, " + name + " не может прыгать..");
        }
    }
}
