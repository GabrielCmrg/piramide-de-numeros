import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Quantas linhas você quer que sua piramide tenha?");
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        scan.close();
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
