package am.ak.spring.mvc.controller;

import java.math.BigDecimal;

/**
 * Created by karlen on 17.05.16.
 */
public class Test {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(0.1);

        for (int i = 0; i < 10; i++) {
            bigDecimal.add(new BigDecimal(0.1));
        }
        System.out.println(bigDecimal);
    }
}
