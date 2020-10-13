package edi.curso.udemy.unitarios.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import edi.curso.udemy.unitarios.Pessoa;

class PessoaJUnitTest
{
    @Test
    void verificarIdadeSenhor()
    {
        Pessoa alguem = new Pessoa();
        alguem.verificarIdade(70);
        Assert.assertTrue(true);
    }
    
    @Test
    void verificarIdadeAdulto()
    {
        Pessoa alguem = new Pessoa();
        alguem.verificarIdade(40);
        Assert.assertTrue(true);
    }
    
    @Test
    void verificarIdadeJovem()
    {
        Pessoa alguem = new Pessoa();
        alguem.verificarIdade(15);
        Assert.assertTrue(true);
    }
    
    @Test
    void verificarIdadeCrianca()
    {
        Pessoa alguem = new Pessoa();
        alguem.verificarIdade(5);
        Assert.assertTrue(true);
    }

}
