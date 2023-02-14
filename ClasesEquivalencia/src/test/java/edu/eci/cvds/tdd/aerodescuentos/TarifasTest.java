package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    //CASO 1, 5% de descuento
    @Test
    public void validateDiscount_5porciento(){
        double tarifa = CalculadorDescuentos.calculoTarifa(200000, 1, 17);
        Assert.assertTrue(190000==tarifa);
    }
    //CASO 2, 20% de descuento
    @Test
    public void validateDiscount_20porciento(){
        double tarifa = CalculadorDescuentos.calculoTarifa(200000, 364, 1);
        Assert.assertTrue(160000==tarifa);
    }
    //CASO 3, 0% de descuento
    @Test
    public void validateDiscount_0porciento(){
        double tarifa = CalculadorDescuentos.calculoTarifa(200000, 17, 19);
        Assert.assertTrue(200000==tarifa);
    }
    //CASO 4, 15% de descuento
    @Test
    public void validateDiscount_15porciento(){
        double tarifa = CalculadorDescuentos.calculoTarifa(200000, 21, 64);
        Assert.assertTrue(170000==tarifa);
    }
    //CASO 5, 8% de descuento
    @Test
    public void validateDiscount_8porciento(){
        double tarifa = CalculadorDescuentos.calculoTarifa(200000, 2, 66);
        Assert.assertTrue(184000==tarifa);
    }
    //CASO 6, 23% de descuento
    @Test
    public void validateDiscount_23porciento(){
        double tarifa = CalculadorDescuentos.calculoTarifa(200000, 364, 199);
        Assert.assertTrue(154000==tarifa);
    }
}
