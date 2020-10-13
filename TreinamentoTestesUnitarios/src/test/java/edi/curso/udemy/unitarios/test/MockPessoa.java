package edi.curso.udemy.unitarios.test;

import static org.mockito.Mockito.mock;

import edi.curso.udemy.unitarios.Pessoa;

public class MockPessoa
{
    public static void main(String[] args)
    {
        Pessoa alguem = mock(Pessoa.class);
        alguem.falar();
    }
    

}
