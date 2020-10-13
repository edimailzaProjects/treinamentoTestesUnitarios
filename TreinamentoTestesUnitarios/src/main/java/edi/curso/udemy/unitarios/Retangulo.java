package edi.curso.udemy.unitarios;

public class Retangulo
{
    int base;
    int altura;

    public Retangulo(int base, int altura)
    {
        super();
        this.base = base;
        this.altura = altura;
    }

    public int getBase()
    {
        return base;
    }

    public void setBase(int base)
    {
        this.base = base;
    }

    public int getAltura()
    {
        return altura;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    public int calcularPerimetro()
    {
        return (2 * this.getBase()) + (2 * this.getAltura());

    }

    public int calcularArea()
    {
        return this.getBase() * this.getAltura();

    }

}
