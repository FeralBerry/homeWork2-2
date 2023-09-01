package faculty;

public class Student {
    private String name;
    private int transgress;
    private int power;
    public Student(String name,int power, int transgress) {
        this.name = name;
        this.power = checkParam(power);
        this.transgress = checkParam(transgress);
    }
    public int checkParam(int param){
        try {
            if(param > 0 && param < 100) {
                return param;
            }
            System.out.println("Параметр должен быть больше 0 и меньше 100");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public String getName(){
        return this.name;
    }
    public int getTransgress(){
        return this.transgress;
    }
    public int getPower(){
        return this.power;
    }
    public String toString(){
        return "Имя: "+getName()+", Сила: "+getPower()+", Трансгресия: "+getTransgress();
    }

    public int comparisonOfStudents() {
       return getTransgress() + getPower();
    }
    public String bestStudent(){
        return getName();
    }

}
