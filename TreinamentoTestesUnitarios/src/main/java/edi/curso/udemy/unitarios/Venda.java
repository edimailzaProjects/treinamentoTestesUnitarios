package edi.curso.udemy.unitarios;

public class Venda
{
    private double valor;
    private Cliente cliente;
    private boolean pagamentoAVista = true;
    private InterfaceCredito creditoService;

    public Venda(double valor, Cliente cliente, InterfaceCredito creditoService) // deve-se passar como par�metro um
                                                                                 // mock na implementa��o a partir da
                                                                                 // interface cr�dito. Aqui foi injetada
                                                                                 // uma depend�ncia
    {
        this.valor = valor;
        this.cliente = cliente;
        this.creditoService = creditoService;
    }

    public double getValor()
    {
        return valor;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setpagamentoAPrazo()
    {
        pagamentoAVista = false;
    }

    public boolean checkout()
    {
        double limite;

        if (pagamentoAVista)
        {
            return true;
        } // se passar aqui, nem vai chamar os de baixo

        try
        {
            limite = creditoService.getLimite(cliente.getCpf()); // o cr�dito service ser� o mock

            if (valor > limite)
            {
                return false;
            }
        }
        catch (RuntimeException r)
        {
            return false;
        }

        return true;
    }

}
