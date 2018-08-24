/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PC2;

import java.math.BigInteger;

/**
 *
 * @author Kirino-Chan
 */
public class Tools {

    public static void Pi() {
        BigInteger pi = new BigInteger("0");
        BigInteger num = new BigInteger("4");
        BigInteger den;
        BigInteger temp;
        int n;
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 == 0) {
                n = (i * 2) - 1;
                den = new BigInteger(Integer.toString(n));
                temp = num.divide(den);
                pi = pi.add(temp);

            } else {
                n = (i * 2) - 1;
                den = new BigInteger(Integer.toString(n));
                temp = num.divide(den);
                pi = pi.subtract(temp);
            }
        }
        //System.out.println(pi);
    }

    public static void Fibonacci() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger temp;

        for (int i = 1; i <= 100000; i++) {
            temp = a.add(b);
            a = b;
            b = temp;
        }
        //System.out.println(b);
    }

}
