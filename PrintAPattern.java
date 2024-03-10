import java.util.Scanner;
public class PrintAPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Pls Input Size and Enter");
        int size = scanner.nextInt();
        int i,j;
        for (i=0;i<size;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}