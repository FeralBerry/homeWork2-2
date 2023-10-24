package faculty;

import java.io.IOException;

public class Ravenclaw extends Student{
    private int smart;
    private int wise;
    private int creativity;
    public Ravenclaw(String name, int power,int transgress, int smart, int wise, int creativity) {
        super(name,power,transgress);
        this.smart = checkParam(smart);
        this.wise = checkParam(wise);
        this.creativity = checkParam(creativity);
    }
    public int getBravery() {
        return this.creativity;
    }
    public int getHonor() {
        return this.wise;
    }
    public int getNobility() {
        return this.smart;
    }
}
