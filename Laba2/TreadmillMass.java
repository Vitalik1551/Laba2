package Laba2;

public enum TreadmillMass {
    Running1("Первая дистанция", 50),
    Running2("Вторая дистанция", 150),
    Running3("Третья дистанция", 350);

    private String NumberDist;
    private int LenghtRoad;

    public String getNumberWall() {

        return NumberDist;
    }

    public int getLenghtRoad() {

        return LenghtRoad;
    }

    TreadmillMass(String numberDist, int lenghtRoad) {
        NumberDist = numberDist;
        LenghtRoad = lenghtRoad;
    }
}
