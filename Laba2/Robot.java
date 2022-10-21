package Laba2;
public class Robot implements RunAndJump {
private String name;
private int MaxDistanse;
private int MaxHeight;


    public Robot(String name) {
        this.name = name;
        this.MaxDistanse = 1000;
        this.MaxHeight = 0;
    }

    @Override
    public boolean run(int distance) {
        if (MaxDistanse >= distance) {

            System.out.println("Робот "+ name + "прошел дистанцию длинной в " + distance + " метра(ов)!");
            return true;
        } else {
            System.out.println("Робот "+ name + "не прошел дистанцию длинной в " + distance + " метра(ов)!");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (MaxHeight>=height) {
        System.out.println("Робот "+name + " перепрыгнул припятсвие высотой " + height + " метра(ов)!"+MaxHeight);
            return true;
        } else {
            System.out.println("Робот "+name + " не перепрыгнул припятсвие высотой " + height + " метра(ов)!");
            return false;
        }
    }

    
}
