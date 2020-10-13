package edi.curso.udemy.unitarios.test;

import edi.curso.udemy.unitarios.FakePilhaDAO;
import edi.curso.udemy.unitarios.Livro;
import edi.curso.udemy.unitarios.Pilha;

public class PilhaTest
{
    Pilha pilha = new Pilha(new FakePilhaDAO()); 

    public boolean testRetirarUltimoLivroInserido()
    {
        Livro livro = new Livro("A bla bla");
        pilha.push(livro);

        livro = new Livro("A pa pa");
        pilha.push(livro);

        livro = new Livro("O bo bo");
        pilha.push(livro);

        String resultadoEsperado = "O bo bo";

        return pilha.pop().getTitulo().equals(resultadoEsperado);
    }

    public boolean testNaoRetirarLivroAlemDoLimite()
    {
        Livro livro1 = new Livro("A aaa");
        Livro livro2 = new Livro("O ooo");
        Livro livro3 = new Livro("A bbb");
        Livro livro4 = new Livro("O aaa");
        Livro livro5 = new Livro("A oaa");
        Livro livro6 = new Livro("O aao");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        String resultadoEsperado = "A oaa";

        return pilha.pop().getTitulo().equals(resultadoEsperado);

    }

    public boolean testNaoAdicionaLivroForaPadraoNome()
    {
        Livro livro = new Livro("A bla bla");
        pilha.push(livro);
        Livro livro1 = new Livro("BBB");
        pilha.push(livro1);

        String resultadoEsperado = "A bla bla";
        return pilha.pop().getTitulo().equals(resultadoEsperado);
    }

}
