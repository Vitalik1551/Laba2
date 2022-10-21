package Laba2;

public class Main {
    public static void main(String[] args) {

        Barriers[] pripyatst = {
                new Treadmill(TreadmillMass.Running3),
                new Wall(WallMass.Wall3),
                new Treadmill(TreadmillMass.Running2),
                new Wall(WallMass.Wall2),
                new Treadmill(TreadmillMass.Running3),
                new Wall(WallMass.Wall3)
        };

        RunAndJump[] runAndJumps = {
                new Cat("Барсик "),
                new Robot("Валли "),
                new Human("Иван ")};

        for (RunAndJump r: runAndJumps) {
            for (Barriers b: pripyatst ){
                if(!b.go(r)){
                    System.out.println();
                    break;};
            }
        }
    }
}
