package ru.Kolganov_aa.dz1;

public class Cat {
    String name;
    int maxDist;
    int maxHigh;

    public void run(int dist) {
        if (dist<maxDist)
        System.out.println(name + " пробежала дистанцию. Поздравляю!");
        else {
            System.out.println(name + " не может пробежать такую дистанцию!");
        }
    }

    public void jump(int height) {
        if (height<maxHigh)
            System.out.println(name + " перыгнула. Ура!");
        else {
            System.out.println("Упс! " + name + " не может перепрыгнуть.");
        }
    }
}
