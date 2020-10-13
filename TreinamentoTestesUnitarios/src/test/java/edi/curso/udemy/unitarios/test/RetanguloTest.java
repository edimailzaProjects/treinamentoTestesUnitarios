package edi.curso.udemy.unitarios.test;

import edi.curso.udemy.unitarios.Retangulo;

public class RetanguloTest
{
    Retangulo retangulo;

    public boolean calcularArea()
    {
        retangulo = new Retangulo(1, 2);
        float resultado = 2f;

        if (retangulo.calcularArea() == resultado)
        {
            System.out.println("Teste Aprovado");
            return true;
        }
        else
            System.out.println("Teste reprovado");
        return false;
    }

    public boolean calcularPerimetro()
    {
        retangulo = new Retangulo(1, 2);
        float resultado = 6;
        
        if (retangulo.calcularPerimetro() == resultado)
        {
            System.out.println("Teste Aprovado");
            return true;
        }
        else
            System.out.println("Teste reprovado");
        return false;
    }

    public static void main(String[] args)
    {
        RetanguloTest ret = new RetanguloTest();
        ret.calcularArea();
        ret.calcularPerimetro();
    }

}
