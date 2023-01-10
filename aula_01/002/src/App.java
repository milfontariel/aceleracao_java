import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNumber = scan.nextInt();
        scan.close();

        System.out.println("=========");
        
        for(int i = 0; i < userNumber; i++){
            String concat = "";
            for(int j = 0; j < i+1; j++) {
                concat += i+1;
            }
            System.out.println(concat);
        }

    }
}
