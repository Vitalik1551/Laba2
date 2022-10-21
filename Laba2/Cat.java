package Laba2;

public class Cat implements RunAndJump {
    private String name;
    private int MaxDistanse;
    private int MaxHeight;
    public int flag=0;
    public Cat(String name) {
        this.name = name;
        this.MaxDistanse = 100;
        this.MaxHeight = 2;
    }

    @Override
    public boolean run(int distance) {
        if (MaxDistanse >= distance) {
            System.out.println("Кот " + name + " прошел дистанцию длинной в " + distance + " метра(ов)!");
            return true;
        } else {
            if (flag == 0) {
                System.out.println("Кот " + name + " прошел дистанцию длинной в "+distance+" метров,используя супер-способность");
                flag++;
                return true;
            } else {
                System.out.println("Кот " + name + " не смог пройти дистанцию длинной в "+distance+" метров, так как он уже использовал супер-способность");
                return false;
            }

        }
    }

    @Override
    public boolean jump(int height) {
        if (MaxHeight >= height) {
            System.out.println("Кот " + name + "смог перепрыгнуть припятсвие высотой " + height + " метра(ов)!");
            return true;
        } else {
            if (flag == 0) {
                System.out.println("Кот " + name + " перепрыгнул припятсвие высотой "+height+" метра,используя супер-способность");
                flag++;
                return true;
            } else {
                System.out.println("Кот " + name + " не смог перепрыгнуть припятсвие высотой "+height+" метра, так как он уже использовал супер-способность");
                return false;
            }
        }
    }
}
