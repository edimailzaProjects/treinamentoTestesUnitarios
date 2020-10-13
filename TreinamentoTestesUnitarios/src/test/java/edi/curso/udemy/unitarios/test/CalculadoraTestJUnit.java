package edi.curso.udemy.unitarios.test;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import edi.curso.udemy.unitarios.Calculadora;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //executa na ordem ascendente do nome
//@FixMethodOrder(MethodSorters.JVM)
public class CalculadoraTestJUnit
{

    @Test(timeout = 200)
    public void testSomar()
    {
      //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 4;
        
        //Act
        int resultadoObtido = calculadora.somar(2, 2);
        
        //Assert
        Assert.assertTrue(resultadoEsperado==resultadoObtido);
        
    }
    
    @Test(timeout = 200) //verificar se extrapola um tempo
    public void testSomarErroTempo()
    {
      //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 4;
        
        //Act
        int resultadoObtido = calculadora.somarErroTempo(2, 2);
        
        //Assert
        Assert.assertTrue(resultadoEsperado==resultadoObtido);
        
    }
    
    
    @Test
    public void testSomarNegativos()
    {
      //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = -4;
        
        //Act
        int resultadoObtido = calculadora.somar(-2, -2);
        
        //Assert
        Assert.assertEquals(resultadoEsperado,resultadoObtido);
        
    }
    
    @Test
    public void testEvitarSomarErroneamente()
    {
      //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 1;
        
        //Act
        int resultadoObtido = calculadora.somar(2, -2);
        
        //Assert       
        Assert.assertNotEquals(resultadoEsperado,resultadoObtido);
        
    }
    
    @Test(expected = ArithmeticException.class)
    public void testEvitarDividirErroneamente()
    {
      //Arrange
        Calculadora calculadora = new Calculadora();
        int a =20;
        int b = 0;
        
        //Act
        calculadora.dividir(a, b);
        
        
    }
    
    @Ignore
    public void testIgnorar()
    {
      System.out.println("Não rodar este teste");      
    }
    
    

}
