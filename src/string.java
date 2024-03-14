import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String x = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String y = scanner.nextLine();

        if (x.equals (y)){
            System.out.println("Строки равны");}
        else {System.out.println("Строки НЕ равны");}


        scanner.close();
    }
}// сравнить строки