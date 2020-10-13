package edi.curso.udemy.unitarios;

public class FakePilhaDAO implements InterfacePilhaDAO
{

    @Override
    public void save(Pilha p)
    {
       System.out.println("Uma pilha falsa");
       System.out.println("Não acessa o banco de dados"); //isto é um Mock: substitui uma classe existente no sistema
       //uma classe apenas para fins de teste: faz as mesmas coisas que PilhaDAO faz, mas é uma versão que não acessa recurso externo
    }
}
