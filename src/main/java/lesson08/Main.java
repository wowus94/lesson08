package lesson08;

public class Main {
    public static void main(String[] args) {

        Runnable human = new Human("Владимир");
        Runnable cat = new Cat("Персик");
        Runnable robot = new Robot("R2D2");

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
            System.out.println();
        } else {
            System.out.printf(name + " не смог пробежать %d м. и сошел с дистанции.\n",distance);
        }
    }

    @Override
    public void jump(int height) {
        Runnable.super.jump(height);
        if (height <= 5) {
            System.out.printf(name + " прыгнул %d метров.\n", height);
            System.out.println();
        } else {
            System.out.printf(name + " не смог прыгнуть %d м. и сошел с соревнований.\n", height);

        }
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
            System.out.println();
        } else {
            System.out.printf(name + " не смог пробежать %d м. и сошел с дистанции.\n",distance);
        }
    }

    @Override
    public void jump(int height) {
        Runnable.super.jump(height);
        if (height <= 3) {
            System.out.printf(name + " прыгнул %d метров. \n", height);
            System.out.println();
        } else {
            System.out.printf(name + " не смог прыгнуть %d м. и сошел с соревнований.\n", height);
        }
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
            System.out.println();
        } else {
            System.out.printf(name + " не смог пробежать %d м. и сошел с дистанции.\n",distance);
        }
    }

    @Override
    public void jump(int height) {
        Runnable.super.jump(height);
        if (height <= 10) {
            System.out.printf(name + " прыгнул %d метров. \n", height);
        } else {
            System.out.printf(name + " не смог прыгнуть %d м. и сошел с соревнований.\n", height);
        }
    }
}

