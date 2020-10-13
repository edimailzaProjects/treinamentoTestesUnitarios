package edi.curso.udemy.unitarios;

public class PilhaDao implements InterfacePilhaDAO
{
    @Override
    public void save(Pilha p) {
        System.out.println("Salva uma pilha usando fake no banco");
    }
    
    public void save2(PilhaMockito pilhaMockito) {
        System.out.println("Salva uma pilha usando mockito no banco");
    }

}
