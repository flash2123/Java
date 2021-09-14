public class Person {
    public static void main(String args[]) { 
        Student s = new Student(); 
            s.display(); 
    }
    public void fun() { 
        System.out.print("person class"); 
    } 
} 
public class Student extends Person { 
    public void fun() { 
        System.out.print("student class"); 
    } 
    public void display() { 
        fun(); 
        super.fun(); 
    } 
} 
// public class Test { 
     
    
// }
