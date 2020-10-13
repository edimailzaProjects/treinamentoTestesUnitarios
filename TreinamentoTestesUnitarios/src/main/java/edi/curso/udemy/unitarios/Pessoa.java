package edi.curso.udemy.unitarios;

public class Pessoa implements InterfacePessoa
{
    public void verificarIdade(int x){
        if(x>=60) {
            String pessoa = "Senhor"; 
            System.out.println(pessoa);
        }else if(x>=21) {
            String pessoa = "Adulto"; 
            System.out.println(pessoa);
        }else if(x >= 14) {
            String pessoa = "Jovem"; 
            System.out.println(pessoa);
        }else {
            String pessoa = "Criança"; 
            System.out.println(pessoa);
        }
    }
    
    @Override
    public void falar() {
        System.out.println("Bla bla bla");
    }

}
