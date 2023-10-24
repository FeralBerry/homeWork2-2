import faculty.*;

public class Hogwarts {
    public static void main(String[] args) {
        Student[] slytherin = {
                new Slytherin("Драко Малфой",10,50,10,20,30,10,20),
                new Slytherin("Грэхэм Монтегю",50,50,10,20,30,10,20),
                new Slytherin("Грегори Гойл",40,50,10,20,30,10,20),
        };
        Student[] gryffindor = {
                new Gryffindor("Гарри Поттер",90,20,70,80,10),
                new Gryffindor("Гермиона Грейнджер",90,20,70,80,10),
                new Gryffindor("Рон Уизли",90,20,70,80,10),
        };
        Student[] hufflepuff = {
                new Hufflepuff("Захария Смит",1,1,1,1,1),
                new Hufflepuff("Седрик Диггори",1,1,1,1,1),
                new Hufflepuff("Джастин Финч-Флетчли",1,1,1,1,1),
        };
        Student[] ravenclaw = {
                new Ravenclaw("Чжоу Чанг",1,1,1,1,1,1),
                new Ravenclaw("Падма Патил",1,1,1,1,1,1),
                new Ravenclaw("Маркус Белби",1,1,1,1,1,1),
        };
        // Выводим на экран список всех учащихся по факультетам
        print(slytherin);
        print(gryffindor);
        print(hufflepuff);
        print(ravenclaw);
        // Выводим на экран лучшего ученика по факультетам
        theBestStudent(gryffindor);
        theBestStudent(slytherin);
        theBestStudent(hufflepuff);
        theBestStudent(ravenclaw);
        // сравнивает 2 студентов из любых факульеттов но трансгрессии и по мощи
        comparisonTransgress(gryffindor[0],slytherin[0]);
        comparisonPower(gryffindor[0],slytherin[0]);
    }
    private static void comparisonTransgress(Student student1, Student student2) {
        if(student1.getTransgress() > student2.getTransgress()){
            System.out.println(student1.getName() + " обладает большей трансгрессией, чем " + student2.getName() + ".");
        } else {
            System.out.println(student2.getName() + " обладает большей трансгрессией, чем " + student1.getName() + ".");
        }
    }
    private static void comparisonPower(Student student1, Student student2) {
        if(student1.getPower() > student2.getPower()){
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName() + ".");
        } else {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName() + ".");
        }
    }

    public static void print(Student[] student){
        for(int i = 0;i < student.length;i++){
            Student s = student[i];
            System.out.println(s.toString());
        }
        System.out.println();
    }
    public static void theBestStudent(Student[] student){
        int min = Integer.MIN_VALUE;
        String str = null;
        for (int i = 0;i < student.length;i++){
            Student s = student[i];
            if (min < s.comparisonOfStudents()){
                min = s.comparisonOfStudents();
                str = s.bestStudent();
            }
        }
        System.out.println(str);
    }
}