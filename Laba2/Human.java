package Laba2;

public class Human implements RunAndJump {
    private String name;
    private int MaxDistanse;
    private int MaxHeight;

    public Human(String name) {
        this.name = name;
        this.MaxDistanse = 5000;
        this.MaxHeight = 3;
    }

    @Override
    public boolean run(int distance) {
        if (MaxDistanse >= distance) {
            System.out.println(name + " прошел дистанцию длинной в " + distance + " метра(ов)!");
            return true;
        } else {
            System.out.println(name + " не прошел дистанцию длинной в " + distance + " метра(ов)!");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (MaxHeight>=height) {
            System.out.println(name + " перепрыгнул припятсвие высотой " + height + " метра(ов)!");
            return true;
        } else {
            System.out.println(name + "не перепрыгнул припятсвие высотой " + height + " метра(ов)!");
            return false;
        }
    }
}
