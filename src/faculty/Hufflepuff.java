package faculty;

import java.io.IOException;

public class Hufflepuff extends Student{
    private int hardworking;
    private int loyal;
    private int honest;
    public Hufflepuff(String name, int power,int transgress, int hardworking, int loyal, int honest) {
        super(name,power,transgress);
        this.hardworking = checkParam(hardworking);
        this.loyal = checkParam(loyal);
        this.honest = checkParam(honest);
    }
    public int getBravery() {
        return this.honest;
    }
    public int getHonor() {
        return this.loyal;
    }
    public int getNobility() {
        return this.hardworking;
    }
}
