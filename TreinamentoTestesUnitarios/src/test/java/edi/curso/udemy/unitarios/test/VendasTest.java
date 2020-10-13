package edi.curso.udemy.unitarios.test;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import edi.curso.udemy.unitarios.Cliente;
import edi.curso.udemy.unitarios.InterfaceCredito;
import edi.curso.udemy.unitarios.Venda;

class VendasTest
{

    @Test
    void testCheckoutClienteComLimite()
    {
        Cliente cliente = new Cliente("12356", "João");
        InterfaceCredito creditoService = mock(InterfaceCredito.class);
        Mockito.when(creditoService.getLimite(cliente.getCpf())).thenReturn(2500d);
        Venda venda = new Venda(2000, cliente, creditoService);
        venda.setpagamentoAPrazo();

        boolean resultado = venda.checkout();

        Assert.assertTrue(resultado);
    }

    @Test
    void testCheckoutClienteSemLimite()
    {
        Cliente cliente = new Cliente("12356", "Josué");
        InterfaceCredito creditoService = mock(InterfaceCredito.class);
        Mockito.when(creditoService.getLimite(cliente.getCpf())).thenReturn(1000d);
        Venda venda = new Venda(2000, cliente, creditoService);
        venda.setpagamentoAPrazo();

        boolean resultado = venda.checkout();

        Assert.assertFalse(resultado);
    }

    @Test
    void testCheckoutVendaAVistaNaoVerificaLimiteDeCredito()
    {
        Cliente cliente = new Cliente("1258146", "Josué");
        InterfaceCredito creditoService = mock(InterfaceCredito.class);
        Mockito.when(creditoService.getLimite(cliente.getCpf())).thenReturn(1000d);
        Venda venda = new Venda(2000, cliente, creditoService);
        venda.checkout();

        Mockito.verify(creditoService, Mockito.never()).getLimite(cliente.getCpf());
    }

    @Test
    void testCheckoutNaoEfetivarVendaSeCreditoServiceFalhar()
    {
        Cliente cliente = new Cliente("121234356", "Consuelo");
        InterfaceCredito creditoService = mock(InterfaceCredito.class);
        Mockito.when(creditoService.getLimite(Mockito.anyString())).thenThrow(new RuntimeException());
        Venda venda = new Venda(2000, cliente, creditoService);
        venda.setpagamentoAPrazo();

        boolean resultado = venda.checkout();

        Assert.assertFalse(resultado);
    }

}
