public class OOPsInheritance{
    public static void main(String args[]){
        Parrot chittu = new Parrot();
        chittu.speak();
        chittu.eat();
        chittu.breathe();
    }
}
    class Animals{
        String GenColor;

        void eat(){
            System.out.println("Eat there respective food");
        }

        void breathe(){
            System.out.println("yEs it breathes");
        }
    }

    class Fish extends Animals{
        void swin(){
            System.out.println("It can swim");
        }
    }
    class Whale extends Fish{
        void biggestfish(){
            System.out.println("Yes it true");
        }
    }
    class Shark extends Fish{
        void Dangerous(){
            System.out.println("Very dangerous");
        }
    }
    class Bird extends Animals{
        void fly(){
            System.out.println("Yes it can Fly");
        }
    }
    class Parrot extends Bird{
        void speak(){
            System.out.println("yes it can speak like human");
        }
    }