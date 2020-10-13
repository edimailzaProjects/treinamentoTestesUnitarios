package edi.curso.udemy.unitarios.test;

import edi.curso.udemy.unitarios.Calculadora;

public class CalculadoraTest
{    
    public static void main(String[] args)
    {
        //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 4;
        
        //Act
        int resultadoObtido = calculadora.somar(2, 2);
        
        //Assert
        if (resultadoEsperado == resultadoObtido)
        {
            System.out.println("Teste aprovado");
        }
        else
        {
            System.out.println("Teste reprovado");
        }

    }

}
