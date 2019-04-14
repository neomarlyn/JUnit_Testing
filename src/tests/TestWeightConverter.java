package tests;

import domain.WeightConverter;
import domain.WeightException;
import junit.framework.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestWeightConverter {

    @Test
    public void testWeightConverterConstructor() {
        WeightConverter wc = new WeightConverter();
        Assert.assertEquals(0.0, wc.getWeightInPounds(), 0.000001);
        Assert.assertEquals(0.0, wc.getWeightInKilograms(), 0.000001);
    }

    @Test
    public void testGetSetWeightInPounds() {
        WeightConverter wc = new WeightConverter();
        try {
            wc.setWeightInPounds(10.0);
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertEquals(4.53592, wc.getWeightInKilograms(), 0.000001);
        Assert.assertEquals(10.0, wc.getWeightInPounds(), 0.000001);
    }
    @Test
    public void testGetSetWeightInKilograms() {
        WeightConverter wc = new WeightConverter();
        try {
            wc.setWeightInKilograms(4.53592);
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertEquals(4.53592, wc.getWeightInKilograms(), 0.000001);
        Assert.assertEquals(10.0, wc.getWeightInPounds(), 0.000001);
    }

    @Test
    public void testToString() {
        WeightConverter wc = new WeightConverter();
        try {
            wc.setWeightInPounds(10.0);
        } catch (Exception e) {
            System.out.println(e);
        }
        String expected = "WeightConverter{weightInPounds=10.0, weightInKilograms=4.53592}";
        Assert.assertTrue(expected.equals(wc.toString()));
    }

    @Test
    public void testconverters() {

        Assert.assertEquals(4.53592, WeightConverter.convertLbsToKgs(10.0), 0.000001);
        Assert.assertEquals(10.0, WeightConverter.convertKgsToLbs(4.53592), 0.000001);

    }
}
