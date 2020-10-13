package edi.curso.udemy.unitarios.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import edi.curso.udemy.unitarios.Animal;

class AnimalJUnitTest
{
    //branches : 2 -> idade maior ou igual à 21 ou menor
    @Test
    void animalOld()
    {
        Animal bicho = new Animal();
        bicho.idadeAnimal(30);
        Assert.assertTrue(true);
    } // independe da quantidade de linhas: tem apenas 2 branches

}
