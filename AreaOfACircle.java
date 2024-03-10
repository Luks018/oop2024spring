import java.util.Scanner;
public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Pls Write Radius and Press Enter");
        float radius = scanner.nextFloat();
        System.out.println("Circlee with this "+ radius + " radius has area : "+ (Math.PI*radius*radius));
    }
}