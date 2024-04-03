package org.iesvdm;

import java.math.BigInteger;

public class Factorial {

    private long n;
    private BigInteger factorial;

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public BigInteger getFactorial() {
        return factorial;
    }

    public void setFactorial(BigInteger factorial) {
        this.factorial = factorial;
    }

    public Factorial(long n) {
        if ( n >= 0)
            this.n = n;
        else
            throw new RuntimeException("Valor " + n + " no permitido.");
    }

    public BigInteger calcula() {

        //this.factorial = BigInteger.ONE;

        //for (long i = 2; i <= this.n; i++)
        //{



        //}

        if (n == 0) {
            return BigInteger.ONE; // El factorial de 0 es 1
        } else if (n < 0) {
            throw new RuntimeException("Valor " + n + " no permitido.");
        } else {
            BigInteger result = BigInteger.ONE;
            for (long i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            factorial = result;
            return factorial;
        }

    }

}
