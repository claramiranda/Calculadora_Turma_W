package org.example;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3,5);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtrair(){
        Calculadora calc = new Calculadora();
        int result = calc.subtrair(3,5);
        assertEquals(-2,result);
    }

    @Test
    public void testMultiplicar(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(3,5);
        assertEquals(15, resultado);
    }

    @Test
    public void testDividir(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.dividir(15,3);
        assertEquals(5,result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisaoPorZero(){
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(15,0);
    }



}
