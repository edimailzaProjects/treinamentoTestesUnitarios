package edi.curso.udemy.unitarios.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PilhaRunner
{
    public static void main(String[] args)
    {
        Result resultado = JUnitCore.runClasses(LivroJUnitTest.class);

        List<Failure> falha = resultado.getFailures();

        System.out.println("Resultado do teste: " + resultado.wasSuccessful());

        for (Failure failure : falha)
        {
            System.out.println(failure.getMessage());
        }
    }
}
