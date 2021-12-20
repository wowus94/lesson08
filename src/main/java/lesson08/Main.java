package lesson08;

public class Main {
    public static void main(String[] args) {

        Runnable human = new Human("Владимир");
        human.run(500);
        human.jump(5);

        Runnable cat = new Cat("Персик");
        cat.run(300);
        cat.jump(3);
        Runnable robot = new Robot("R2D2");
        robot.run(1000);
        robot.jump(10);

        Runnable[] member = new Runnable[3];
        member[0] = human;
        member[1] = cat;
        member[2] = robot;

        int[] run = new int[]{200, 300, 400, 500, 1000};

        for (int e : run) {
            for (Runnable runner : member) {
                runner.run(e);
            }
        }
        int[] jump = new int[]{1, 3, 5, 10};

        for (int a : jump) {
            for (Runnable jumper : member) {
                jumper.jump(a);
            }
        }
    }
}

interface Runnable {
    void run(int distance);

    default void jump(int height) {
    }

}

class Human implements Runnable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.printf(name + " пробежал %d метров.\n", distance);
        } else {
            System.out.printf(name + " не смог пробежать и сошел с дистанции.\n");

        }
    }

    @Override
    public void jump(int height) {
        Runnable.super.jump(height);
        if (height <= 5) {
            System.out.printf(name + " прыгнул %d метров. \n", height);
        }else{
            System.out.print(name + " не смог прыгнуть и сошел с соревнований.");
        }
        System.out.println();
    }
}
class Cat implements Runnable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 300) {
            System.out.printf(name + " пробежал %d метров.\n", distance);
        } else {
            System.out.printf(name + " не смог пробежать и сошел с дистанции.\n");
        }
    }
    @Override
    public void jump(int height) {
        Runnable.super.jump(height);
        if (height <= 3) {
            System.out.printf(name + " прыгнул %d метров. \n", height);
        }else{
            System.out.printf(name + " не смог прыгнуть и сошел с соревнований.\n");
        }
        System.out.println();
    }
}

class Robot implements Runnable {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 1000) {
            System.out.printf(name + " пробежал %d метров.\n", distance);
        } else {
            System.out.printf(name + " не смог пробежать и сошел с дистанции.\n");
        }
    }
    @Override
    public void jump(int height) {
        Runnable.super.jump(height);
        if (height <= 10) {
            System.out.printf(name + " прыгнул %d метров. \n", height);
        }else{
            System.out.printf(name + " не смог прыгнуть и сошел с соревнований.\n");
        }
        System.out.println();
    }
}

