package edi.curso.udemy.unitarios;

public class Venda
{
    private double valor;
    private Cliente cliente;
    private boolean pagamentoAVista = true;
    private InterfaceCredito creditoService;

    public Venda(double valor, Cliente cliente, InterfaceCredito creditoService) // deve-se passar como parâmetro um
                                                                                 // mock na implementação a partir da
                                                                                 // interface crédito. Aqui foi injetada
                                                                                 // uma dependência
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
            limite = creditoService.getLimite(cliente.getCpf()); // o crédito service será o mock

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
