package edi.curso.udemy.unitarios;

public class Cliente
{
    private String cpf;
    private String nome;
    
    public Cliente(String cpf, String nome)
    {
        super();
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public String getNome()
    {
        return nome;
    }
    
    
}
