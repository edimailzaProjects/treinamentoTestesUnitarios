package edi.curso.udemy.unitarios.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import edi.curso.udemy.unitarios.Livro;


class LivroJUnitTest
{

    @Test
    void test()
    {
        Livro livro = new Livro("A Lua");
        String resultadoEsperado = "A Lua";
        
        String resultatObtido = livro.getTitulo();
        
        Assert.assertEquals(resultadoEsperado, resultatObtido);
    }

}
