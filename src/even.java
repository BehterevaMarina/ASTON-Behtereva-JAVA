
public class even {
    public static void main(String[] args) {

        int[] mass = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Даны числа от 1 до 10");
        System.out.print("Четные числа из них: ");
        for (int q:mass){
            if (q%2 == 0) {System.out.print(q + " ");}
        }

    }
}// четные