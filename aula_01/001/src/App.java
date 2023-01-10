import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNumber = scan.nextInt();
        scan.close();
        
        for(int i = 1; i <= 10; i++) {
            String result = "%d x %d = %d";

            System.out.println(String.format(result, userNumber, i, userNumber * i));
        }

    }
}
