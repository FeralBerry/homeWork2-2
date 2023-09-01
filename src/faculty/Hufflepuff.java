package faculty;

import java.io.IOException;

public class Hufflepuff extends Student{
    private int hardworking; // Трудолюбивость
    private int loyal; // Верость
    private int honest; // Честность
    public Hufflepuff(String name, int power,int transgress, int hardworking, int loyal, int honest) {
        super(name,power,transgress);
        this.hardworking = checkParam(hardworking);
        this.loyal = checkParam(loyal);
        this.honest = checkParam(honest);
    }
    public int getHardworking() {
        return this.hardworking;
    }
    public int getLoyal() {
        return this.loyal;
    }
    public int getHonest() {
        return this.honest;
    }
    public String toString(){
        return super.toString() +
                ", Трудолюбивость: " + getHardworking() +
                ", Верость: " + getLoyal() +
                ", Честность: " + getHonest();
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Пуфендуй.";
    }
}
