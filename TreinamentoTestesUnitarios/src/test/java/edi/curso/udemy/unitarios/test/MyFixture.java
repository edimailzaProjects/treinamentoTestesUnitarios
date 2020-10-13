package edi.curso.udemy.unitarios.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyFixture
{

    @BeforeAll
    public static void setUpBeforeClass()
    {
        System.out.println("Este m�todo executa uma vez antes do primeiro teste");
    }

    @AfterAll
    public static void tearDownAfetClass()
    {
        System.out.println("Este m�todo executa uma vez ap�s o �ltimo teste");
    }

    @BeforeEach
    public void setUp()
    {
        System.out.println("Este m�todo executa ANTES DE CADA teste");
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("Este m�todo executa uma vez AP�S CADA teste");
    }

    @Test
    void test1()
    {
        System.out.println("Teste 1");
    }

    @Test
    void test2()
    {
        System.out.println("Teste 2");
    }

}
