public class Vehicle {
//     public String colour;
//     private int number;
//     public void set(int number){
//         number=number;
//     }
//     public int get(){
//         return number;
//     }
// }

// class Car extends Vehicle{
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle();
//         v.colour = "white";
//         v.set(1010) ;
//         System.out.println(v.colour + " " + v.get());
//     }

// -----------------next -----------------------------
public static void main(String[] args){   
    Vehicle obj1 = new Car();
    obj1.print();

    Vehicle obj2 = new Vehicle();
    obj2.print();  
    }
    void print(){
        System.out.print("Vehicle class");
        }
    }
class Car extends Vehicle{
    void print(){
    System.out.print("Car class ");
    }
}

// public class Main {
    
    
// }
