import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try(Scanner input = new Scanner(System.in)) {
    System.out.println("Unesi broj: ");
    long broj = input.nextLong();
        System.out.println("Faktorijel broja " + broj + " je: " + IzrFaktorijel(broj));
    }
    catch(InputMismatchException e){
    System.err.println("Pogresan unos! Unesite cijeli broj!");
    }
    catch(ArithmeticException e){
        System.err.println(e.getMessage());
    }
    }

    public static long IzrFaktorijel(long broj){
        if(broj<=0){
            throw new ArithmeticException("Broj ne moze biti manji od nule ili nula!");
        }
        else if(broj>20){
            throw new ArithmeticException("Broj ne smije biti veci od 20 jer ne stane u varijablu long");
        }
        long faktorijel = 1;
        for(long i = 1; i<=broj; i++){
            faktorijel *=i;
        }
        return faktorijel;
    }
}