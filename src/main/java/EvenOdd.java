
/**
 *
 * @author kimbe
 */
public class EvenOdd {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int isEven = 0;
        int isOdd = 0;
        System.out.println("iterations" + " even" + " odd");
//loop to run 10 iterations

        for (x = 1; x <= 10; x++) {

//loop to generate random numbers
            for (int z = 1; z <= 10; z++) {
                int n = (int) (Math.random() * 1000 + 1);

                int even = isEven(n);
                if (even == 1) {
                    isEven++;

                } else {
                    isOdd++;
                }

            }
            System.out.println(x + " " + isEven + " " + isOdd);

        }
    }

    public static int isEven(int number) {
        if ((number % 2) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
