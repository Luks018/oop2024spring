import  java.util.Scanner;
public class ConvertMinutesToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any minute and Press Enter");
        int min = scanner.nextInt();
        int sec = min * 60;
        System.out.println(min + " min =  "+ sec+" sec");
    }
}
