public class Student {

    //Прямоугольник деген класс тузунуз
 //• Свойстваларын бериниз
 //• Конструктор тузунуз
 //• Обьекттерди тузунуз жана свойстваларына маанилерди бериниз • Маанилерин консольго чыгарыныз"""


    private String name;
    private int age;
    private String course;
    private int payment;
    private double weight;


    public Student() {

    }
    public Student(String name,
                   int age,
                   int payment){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPayment() {
        return payment;
    }
    public double getWeight() {
        return weight;
    }
}


































    //    // Конструктор без аргумента
//    public  Student() {
//
//    }
//    // Конструктор c аргументами
//    public Student (String name , int age) {
//        this.name=name;
//        this.age=age;
//    }
//    public  String getName() {
//        return name;
//
//    }
//    public int getAge() {
//        return getAge();
