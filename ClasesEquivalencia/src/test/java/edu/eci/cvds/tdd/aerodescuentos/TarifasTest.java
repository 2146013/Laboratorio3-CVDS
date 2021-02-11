package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;

public class TarifasTest {

    @Test
    public void validateCase1() {
    	double tarifaBase = 300000;
    	int diasAntelacion = 34;
    	int edad = 5;
    	double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    	double resultado = 240000.0;
        Assert.assertEquals(resultado, tarifa, 0);
    }

    @Test
    public void validateCase2() {
    	double tarifaBase = 500000;
    	int diasAntelacion = 40;
    	int edad = 23;
    	double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    	double resultado = 425000.0;
        Assert.assertEquals(resultado, tarifa, 0);
    }

    @Test
    public void validateCase3() {
    	double tarifaBase = 700000;
    	int diasAntelacion = 38;
    	int edad = 70;
    	double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    	double resultado = 539000.0;
        Assert.assertEquals(resultado, tarifa, 0);
    }

    @Test
    public void validateCase4() {
    	double tarifaBase = 650000;
    	int diasAntelacion = 15;
    	int edad = 14;
    	double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    	double resultado = 617500.0;
        Assert.assertEquals(resultado, tarifa, 0);
    }

    @Test
    public void validateCase5() {
    	double tarifaBase = 800000;
    	int diasAntelacion = 5;
    	int edad = 30;
    	double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    	double resultado = 800000.0;
        Assert.assertEquals(resultado, tarifa, 0);
    }

    @Test
    public void validateCase6() {
    	double tarifaBase = 750000;
    	int diasAntelacion = 13;
    	int edad = 68;
    	double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    	double resultado = 690000.0;
        Assert.assertEquals(resultado, tarifa, 0);
    }

    /*
    @Test
    public void validateCase7() {
    	double tarifaBase = 100000;
    	int diasAntelacion = 0;
    	int edad = -5;
    	double tarifa = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    	Assert.assertEquals(resultado, tarifa, 0);
    }*/
}