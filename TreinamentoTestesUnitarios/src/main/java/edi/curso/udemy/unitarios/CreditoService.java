package edi.curso.udemy.unitarios;

public class CreditoService implements InterfaceCredito
{

    @Override
    public double getLimite(String cpf)
    {
        System.out.println("Consultando administradora de cartões...");
        return 1500;
    }

}
