package challenge.swing;

import challenge.ParametrosInvalidosException;

public class Counter {
    public static int[] count(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if (paramUm <= paramDois) {
            throw new ParametrosInvalidosException();
        }
        else {
            int count = paramUm - paramDois;
            int[] arrayCount = new int[count];
            for(int i = 1; i <= count; i++) {
                arrayCount[i-1] = i;
            }
            return arrayCount;
        }
    }
}
