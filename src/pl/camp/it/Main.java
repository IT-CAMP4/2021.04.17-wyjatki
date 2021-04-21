package pl.camp.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        m.a();

        /*int[] tab = null;

        try {
            //
            //
            //
            //
            //
            //
            //
            System.out.println(tab[10]);
        } catch (ArrayIndexOutOfBoundsException e) {

        } finally {
            System.out.println("Zamknij połączenie !!");
        }

        System.out.println("Program poszedł dalej !!!");*/

        /*try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            br.readLine();
        } catch (IOException e) {
            System.out.println("Coś się zepsuło !!");
        }*/
    }

    public void a() throws DivideByZeroException {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
}
