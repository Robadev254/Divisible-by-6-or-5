import java.math.BigInteger;

public class DivisibleByFiveOrSix {
    public static void main(String[] args) {
        final int NUMBERS_TO_FIND = 10;
        BigInteger currentNumber = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int foundNumbers = 0;

        while (foundNumbers < NUMBERS_TO_FIND) {
            if (isDivisibleByFiveOrSix(currentNumber)) {
                System.out.println(currentNumber);
                foundNumbers++;
            }
            currentNumber = currentNumber.add(BigInteger.ONE);
        }
    }

    private static boolean isDivisibleByFiveOrSix(BigInteger number) {
        return number.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
               number.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO);
    }
}
