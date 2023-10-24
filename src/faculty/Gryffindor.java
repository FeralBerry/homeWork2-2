package faculty;

import java.io.IOException;

public class Gryffindor extends Student{
    private int nobility;
    private int honor;
    private int bravery;
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
}
