package faculty;

import java.io.IOException;

public class Ravenclaw extends Student{
    private int smart; // Ум
    private int wise; // Мудрость
    private int witty; // Остроумность
    private int creativity; // Креативность
    public Ravenclaw(String name, int power,int transgress, int smart, int wise, int witty, int creativity) {
        super(name,power,transgress);
        this.smart = checkParam(smart);
        this.wise = checkParam(wise);
        this.witty = checkParam(witty);
        this.creativity = checkParam(creativity);
    }
    public int getSmart() {
        return this.smart;
    }
    public int getWise() {
        return this.wise;
    }
    public int getWitty() {
        return this.witty;
    }
    public int getCreativity() {
        return this.creativity;
    }
    public String toString(){
        return super.toString() +
                ", Ум: " + getSmart() +
                ", Мудрость: " + getWise() +
                ", Остроумность: " + getWitty() +
                ", Креативность: " + getCreativity();
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Когтевран.";
    }
}
