package edi.curso.udemy.unitarios;

public class Calculadora
{
    private int num1;
    private int num2;

    public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public int somar(int n1, int n2)
    {
        this.setNum1(n1);
        this.setNum2(n2);

        return this.getNum1() + this.getNum2();
    }

    public int somarErroTempo(int n1, int n2)
    {
        int x = 10;
        while (x > 0)
        {

            try
            {
                Thread.sleep(200);
                x--;
            }
            catch (Exception e)
            {
            }

        }
        return n1 + n2;
    }

    public int dividir(int n1, int n2)
    {
        if (n2 == 0)
        {
            throw new ArithmeticException();
        }
        return n1 / n2;
    }

}
