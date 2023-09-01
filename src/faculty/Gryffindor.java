package faculty;

import java.io.IOException;

public class Gryffindor extends Student{
    private int nobility; // Благородство
    private int honor; // Честь
    private int bravery; // Храбрость
    public Gryffindor(String name, int power,int transgress, int nobility, int honor, int bravery) {
        super(name,power,transgress);
        this.nobility = checkParam(nobility);
        this.honor = checkParam(honor);
        this.bravery = checkParam(bravery);
    }
    public int getBravery() {
        return this.bravery;
    }
    public int getHonor() {
        return this.honor;
    }
    public int getNobility() {
        return this.nobility;
    }
    public String toString(){
        return super.toString() +
                ", Благородство: " + getBravery() +
                ", Честь: " + getHonor() +
                ", Храбрость: " + getNobility();
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Грифендор.";
    }
}
