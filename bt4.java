
public class bt4 {
    // phụ câu hỏi 1 trong câu 4.
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // phụ câu hỏi 2 trong câu 4 .
    public static boolean isPrimeNumbe(int a) {
        if (a < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(a);

        for (int i = 2; i < squareRoot; i++) {
            if (a % i == 0 && a < 10) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;

        int i = 2;
        while (count < 10) {
            if (isPrimeNumber(i)) {
                System.out.println(i); // giải câu hỏi 1 .
                count++;
            }

            i++;
        }
        while (count < 4) {
            if (isPrimeNumbe(i)) {
                System.out.println(i);// giải câu 2 , e cũng ko biết vì sao nó ko in ra :() rõ ràng e đã cho a<10 ở
                                      // trên rồi .

                count++;

            }
            i++;
        }
    }
}
