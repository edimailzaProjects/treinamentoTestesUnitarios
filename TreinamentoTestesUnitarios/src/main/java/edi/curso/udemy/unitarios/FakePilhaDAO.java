package edi.curso.udemy.unitarios;

public class FakePilhaDAO implements InterfacePilhaDAO
{

    @Override
    public void save(Pilha p)
    {
       System.out.println("Uma pilha falsa");
       System.out.println("N�o acessa o banco de dados"); //isto � um Mock: substitui uma classe existente no sistema
       //uma classe apenas para fins de teste: faz as mesmas coisas que PilhaDAO faz, mas � uma vers�o que n�o acessa recurso externo
    }
}
