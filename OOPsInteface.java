class OOPsInteface{
    public static void main(String args[]){
        student s1 = new student();
        s1.schoolName= "alpa";
       
        student s2 =new student();
        System.out.println(s2.schoolName);

        student s3 = new student();
        s3.schoolName = "abD";
        System.out.println(s2.schoolName);

    }
    
}
// interface ChessPlayer{
//     void moves();
// }
// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up,down,Right,Left,daigonal (in all four direction)");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up,down,Right,Left (in all four direction)");
//     }
// }
// class Pawn implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up,down,Right,Left,daigonal (in all four direction)");
//     }
// }
// interface Carnivorous {
//     void eat_Animal ();
// }
// interface Herbivours {
//     void eat_plant(); 
// }
// class Bear implements Herbivours,Carnivorous{
//     public void eat_plant(){
//         System.out.println("It eat plant ");
//     }
//     public void eat_Animal(){
//         System.out.println("It eat other animal");
//     }
// }
class student {
    String name;
    int roll; 

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name; 
    }
}