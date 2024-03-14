import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();

        System.out.println("сумма чисел = " + (x+y) + " разница = " + (x-y) +
                " произведение = " + (x*y));

        if (y == 0) {System.out.println("поделить на ноль нельзя");}
        else {System.out.println("частное = " + ((float) x/y));}

        if (x>y) {System.out.println("первое число больше");}
        if (x<y) {System.out.println("первое число меньше");}
        if (x==y) {System.out.println("числа равны");}


        scanner.close();
    }

}//+-/* сравнение