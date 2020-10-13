package edi.curso.udemy.unitarios.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edi.curso.udemy.unitarios.FakePilhaDAO;
import edi.curso.udemy.unitarios.Livro;
import edi.curso.udemy.unitarios.Pilha;

class PilhaJUnitTest
{

    private static Pilha pilha;

    @BeforeAll
    static void setUpBeforeClass() throws Exception
    {
        pilha = new Pilha(new FakePilhaDAO());
        System.out.println("Executou o before all");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception
    {
        pilha = null;
        System.out.println("Executou o after all");
    }

    @BeforeEach
    void setUp() throws Exception
    {
        Livro livro1 = new Livro("A terra");
        Livro livro2 = new Livro("A roda");
        Livro livro3 = new Livro("O globo");
        Livro livro4 = new Livro("A lua");
        Livro livro5 = new Livro("O sol");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        
        System.out.println("Executou o before each");

    }

    @AfterEach
    void tearDown() throws Exception
    {
        int tamanho = pilha.count();
        while (tamanho > 0)
        {
            pilha.pop();
            tamanho--;
        }
        
        System.out.println("Executou o after each");
    }

    @Test
    void testNaoAdicionaLivroAlemDoLimite()
    {
        try
        {
            pilha.push(new Livro("A Volta ao mundo"));
            fail();
            
        }
        catch (ArrayStoreException e)
        {
            Assert.assertTrue(true);
        }
        
        System.out.println("Executou testNaoAdicionaLivroAlemDoLimite");
    }
    
//    @Test(expected = ArrayStoreException.class)
//    void testNaoAdicionaLivroAlemDoLimiteExceptuion()
//    {
//        
//            pilha.push(new Livro("A Volta ao mundo"));           
//      
//        System.out.println("Executou testNaoAdicionaLivroAlemDoLimite");
//    }

    @Test
    void testNaoAdicionaLivroForaPadraoNome()
    {
        pilha.pop();
        pilha.push(new Livro("Teste"));
        Livro livro = pilha.pop();

        Assert.assertEquals("A lua", livro.getTitulo());
        System.out.println("Executou testNaoAdicionaLivroForaPadraoNome");
    }

}
