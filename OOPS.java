public class OOPS{
    public static void main(String args[]) {
        // student s1 = new student();
        // s1.name = "ali";
        // s1.roll = 132;
        // s1.password = "sadfs";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // student s2 = new student(s1);
        // s2.password = "abcdef";

        // for(int i=0; i<3; i++){
        //     System.out.println(s2.marks[i]);
        // }
        // Cat billu = new Cat();
        // billu.eat();
        // int sleepHours = 13;
        // System.out.println(sleepHours);

        // dog sera = new dog();
        // sera.bread = "harami";
        // System.out.println(sera.bread);
        // sera.legs = 4;
        // System.out.println(sera.legs);
        // sera.eat();
        Bird parrot =  new Bird();
        parrot.eat();
        parrot.fly();
        parrot.breathe();
        parrot.color ="Green";
        System.out.println(parrot.color);
    }
}


class Pen {
    //Properties
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    //function
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    student(student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int [3];
        this.marks = s1.marks;

    }
    
    //non-parametrized constructor
    student(){
        System.out.println("constructor is called ....");
    }

    //parametrized constructor
    student(String name){
        this.name = name;
    }
    student(int roll){
        this.roll =roll;
    }
}

//base class or parent class
class Animals{
    String color;

    void eat(){
        System.out.println("biscuit");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammals extends Animals{
    int legs;
}
class Fish extends Animals{
    void swin() {
        System.out.println("yes it can swim");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("yes it can fly");
    }
}
class dog extends Mammals{
    String bread;
}
class Cat extends Animals{
    int sleepHours;

    void swin(){
        System.out.println(swin()); 
    }
}