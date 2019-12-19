package ru.Kolganov_aa.dz1;

public class Human {
    String name;
    int maxDist;
    int maxHigh;


    public void run(int dist) {
        if (dist<maxDist)
        System.out.println(name + " пробежал дистанцию. Это победа!");
        else {
            System.out.println("Упс, что-то пошло не так! " + name + " не смог пробежать дистанцию.");
        }
    }

    public void jump(int height) {
        if (height<maxHigh)
        System.out.println("Ура!" + name + " перыгнул.");
        else {
            System.out.println("Неудача... " + name + " не перепрыгнул");
        }
    }
}
