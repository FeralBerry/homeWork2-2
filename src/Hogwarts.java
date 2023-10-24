import faculty.*;

public class Hogwarts {
    public static void main(String[] args) {
        Student[] slytherin = {
                new Slytherin("Драко Малфой",10,50,10,20,30,10,20),
                new Slytherin("Грэхэм Монтегю",50,50,10,20,30,10,20),
                new Slytherin("Грегори Гойл",50,50,10,20,30,10,20),
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
        Student[] r = {
                new Ravenclaw("Чжоу Чанг",1,1,1,1,1),
                new Ravenclaw("Падма Патил",1,1,1,1,1),
                new Ravenclaw("Маркус Белби",1,1,1,1,1),
        };
        for(int i = 0;i < slytherin.length;i++){
            Student student = slytherin[i];
            System.out.println(student.toString());
        }
    }
}