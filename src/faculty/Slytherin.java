package faculty;

public class Slytherin extends Student{
    private int cunning; // Хитрость
    private int determination; // Решительность
    private int ambition; // Амбициозность
    private int resourcefulness; // Находчивость
    private int thirstForPower; // Жажда власти

    public Slytherin(String name, int power,int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name,power,transgress);
        this.cunning = checkParam(cunning);
        this.determination = checkParam(determination);
        this.ambition = checkParam(ambition);
        this.resourcefulness = checkParam(resourcefulness);
        this.thirstForPower = checkParam(thirstForPower);
    }
    public int getCunning() {
        return this.cunning;
    }
    public int getDetermination() {
        return this.determination;
    }
    public int getAmbition() {
        return this.ambition;
    }
    public int getResourcefulness() {
        return this.resourcefulness;
    }
    public int getThirstForPower() {
        return this.thirstForPower;
    }
    public String toString(){
        return super.toString() +
                ", Хитрость: " + getCunning() +
                ", Решительность: " + getDetermination() +
                ", Амбициозность: " + getAmbition() +
                ", Находчивость: " + getResourcefulness() +
                ", Жажда власти: " + getThirstForPower();
    }
    public int comparisonOfStudents(){
        return super.comparisonOfStudents() + getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getThirstForPower();
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Слизерин.";
    }
}
