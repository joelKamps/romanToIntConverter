package main;

/**
 * Created by joel_thinkpad on 24.10.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        RomanToInt romanToInt = new RomanToInt();

        Integer erg = romanToInt.romanToInt("XCIX");
        System.out.printf(erg.toString());

    }

}
