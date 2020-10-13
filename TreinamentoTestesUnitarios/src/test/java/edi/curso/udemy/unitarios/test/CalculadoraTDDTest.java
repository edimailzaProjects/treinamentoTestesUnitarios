package edi.curso.udemy.unitarios.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import edi.curso.udemy.unitarios.RetanguloTDD;

class CalculadoraTDDTest
{
    @Test
    void testCalcularArea() //faz as execuções falharem, e, depois implementa.
    {
        RetanguloTDD retangulo = new RetanguloTDD();
        int a = 10;
        int b = 2;
        int resultadoEsperado = 20;
        
        int resultadoObtido = retangulo.calcularArea(a,b);
        Assert.assertEquals(resultadoEsperado,resultadoObtido);
    }

}
