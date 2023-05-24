class OOPsAbstraction{
    public static void main(String args[]){

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c .walk();
        
        Mustang mus = new Mustang();

    }
}
    abstract class Animal{
        String color;
        Animal(){
            System.out.println("animal constructor called");
        }
        void eat(){
            System.out.println("eat food respectively");
        }
        abstract void walk();
    }
    class Horse extends Animal{
        Horse(){
            System.out.println("Horse constructor called");
        }
        void changeColor(){
            color = " dark Brown";
        }
        void walk(){
            System.out.println("they walk on 4 legs");
        }
    }
    class Mustang extends Horse{
        Mustang(){
            System.out.println("Mustang constructor called");
        }
    }
    class Chicken extends Animal{
        void walk(){
            System.out.println("They walk on 2 legs");
        }
    }