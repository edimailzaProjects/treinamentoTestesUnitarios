package edi.curso.udemy.unitarios;

import java.util.ArrayList;

public class Pilha
{
    int limite = 5;
    ArrayList<Livro> pilha = new ArrayList<Livro>();
    
    // PilhaDao pilhaDAO = new PilhaDao(); //não deixa ela usar isso aqui!
    
    InterfacePilhaDAO pilhaDAO; // INJEÇÃO DE DEPENDÊNCIA: injeta a dependência da classe em vez de
    // deixar a classe injetar sua dependência

    public Pilha(InterfacePilhaDAO pilhaDAO) // recebe um objeto de uma classe que implementa a interface
                                             // InterfacePilhaDAO
    // assim, é possível abrir a possibilidade de criar uma outra classe que implenta a interface
    {
        this.pilhaDAO = pilhaDAO;
    }

    public void push(Livro livro)
    {
        if (pilha.size() >= limite)
        {
            throw new ArrayStoreException();
        }

        if (!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O"))
        {
            return;
        }

        pilha.add(livro);
        pilhaDAO.save(this);
        // acoplamento entre classes: quando uma é instanciada, a outra também é!
        // Teste unitario não deve acessar recurso externo! O banco, por ex. pode estar fora do ar!

    }

    public Livro pop()
    {
        Livro livro = pilha.get(pilha.size() - 1);
        pilha.remove(pilha.size() - 1);
        return livro;
    }

    public int count()
    {
        return pilha.size();
    }

}
