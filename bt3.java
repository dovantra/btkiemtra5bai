import java.util.Random;

public class bt3 {

    public static void main(String[] args) {

        Random sx = new Random();
        int n = sx.nextInt();
        System.out.println(n);
        if (n <= 1) {
            System.out.println("n không phải số nguyên tố ");
            ;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                System.out.println(" n không phải là số nguyên tố ");
            } else {
                System.out.println(" n là số nguyên tố ");
            }
        }
    }

}
