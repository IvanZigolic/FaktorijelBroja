import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BigIntegerFaktorijel {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Unesi broj: ");
            long broj = input.nextLong();
            System.out.println("Faktorijel broja " + broj + " je: " + izrFaktorijel(broj));
        }
        catch (InputMismatchException e) {
            System.err.println("Pogresan unos! Unesite cijeli broj!");
        }
        catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public static BigInteger izrFaktorijel(long broj) {
        if (broj < 0) {
            throw new ArithmeticException("Broj ne moze biti negativan!");
        }
        BigInteger faktorijel = BigInteger.ONE;
        for (long i = 2; i <= broj; i++) {
            faktorijel = faktorijel.multiply(BigInteger.valueOf(i));
        }
        return faktorijel;
    }
}