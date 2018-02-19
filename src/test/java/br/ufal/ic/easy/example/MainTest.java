package br.ufal.ic.easy.example;

import org.junit.Test;
import org.junit.Assert;

public class MainTest {

    @Test
    public void evaluateSum() {
        int result = Main.sum(6, 4);

        Assert.assertEquals(7, result);
    }

}