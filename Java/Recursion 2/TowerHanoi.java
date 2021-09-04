import java.util.Scanner;
public class TowerHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        if(disks==1){
            System.out.println(source + " " + destination);
            // System.out.println(source, destination);
            return;
        }
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println(source +  " "  + destination);
        // System.out.println(disks, source, destination);
        towerOfHanoi(disks-1, auxiliary, source, destination);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int disks = s.nextInt();
        char source=s.next().charAt(0);
        char auxiliary=s.next().charAt(0);
        char destination=s.next().charAt(0);
        towerOfHanoi(disks, source, auxiliary, destination);
        // System.out.println(tow);
    }
    
}
