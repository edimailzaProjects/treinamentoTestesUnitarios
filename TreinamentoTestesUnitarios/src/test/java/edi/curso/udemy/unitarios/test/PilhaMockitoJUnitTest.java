package edi.curso.udemy.unitarios.test;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import edi.curso.udemy.unitarios.Livro;
import edi.curso.udemy.unitarios.PilhaDao;
import edi.curso.udemy.unitarios.PilhaMockito;

public class PilhaMockitoJUnitTest
{
    PilhaDao pilhaDAO  = mock(PilhaDao.class);

    @Test
    public void testRetirarUltimoLivroInserido()
    {
        PilhaMockito pilha = new PilhaMockito(pilhaDAO);
        Livro livro = new Livro("A aaa");
        pilha.push(livro);
        
        Livro livro2 = new Livro("O aaa");
        pilha.push(livro2);
        
        String resultadoEsperado = "O aaa";
        Assert.assertEquals(resultadoEsperado, pilha.pop().getTitulo());
        
    }

}
