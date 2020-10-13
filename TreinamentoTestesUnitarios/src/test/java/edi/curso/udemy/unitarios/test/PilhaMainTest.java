package edi.curso.udemy.unitarios.test;

public class PilhaMainTest
{
    public static void main(String[] args)
    {
        PilhaTest pilhaTest = new PilhaTest();
        boolean resultado;
        resultado = pilhaTest.testRetirarUltimoLivroInserido();

        System.out.println("Teste Retirar Ultimo Livro Inserido: " + resultado);

        resultado = pilhaTest.testNaoRetirarLivroAlemDoLimite();

        System.out.println("Teste Retirar Ultimo Livro Inserido: " + resultado);

        resultado = pilhaTest.testNaoAdicionaLivroForaPadraoNome();

        System.out.println("Teste Nao Adiciona Livro Fora Padrao Nome: " + resultado);

    }

}
