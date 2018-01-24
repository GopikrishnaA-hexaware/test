package com.gopikrishna;

import org.junit.Test;
import com.gopikrishna.Multiply;

public class Multest {

    @Test
    public void testmul() {
        System.out.println("hi");
        Multiply b = new Multiply();
        int e = b.mul(10, 20);
        System.out.println("hhhh" + e);
    }

}