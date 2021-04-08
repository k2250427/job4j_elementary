package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExistThenTrue() {
        double ab = 3;
        double ac = 4;
        double bc = 5;
        boolean out = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(out);
    }
}