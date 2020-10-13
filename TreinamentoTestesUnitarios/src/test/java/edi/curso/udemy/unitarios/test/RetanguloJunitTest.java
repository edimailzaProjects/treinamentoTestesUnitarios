package edi.curso.udemy.unitarios.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Ignore;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edi.curso.udemy.unitarios.Retangulo;

@RunWith(Parameterized.class)
class RetanguloJunitTest
{
    private int base;
    private int altura;
    private int area;
    
    @Parameters
    public static Collection<Object[]> parametros(){
        return Arrays.asList(new Object[][]{
            {10,20,200},
            {10,30,300}
        });
    }   

    public RetanguloJunitTest(int base, int altura, int area)
    {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    @Ignore
    //@ParameterizedTest
    void testCalcularArea()
    {
        Retangulo retangulo = new Retangulo(base, altura);
        int resultado = retangulo.calcularArea();
        
        Assert.assertEquals(area, resultado);
    }
    
    @Ignore
    void testCalcularPerimetro()
    {
        fail("Not yet implemented");
    }

}
