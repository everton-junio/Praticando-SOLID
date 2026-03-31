package org.SobrescritaSobrecarga;

public class Sobrescrita {
    ClasseA classe = new ClasseA();
    ClasseA classe2 = new ClasseB();
    void main(){
        classe.falar();
        classe2.falar();
    }
}

class ClasseA{
    public void falar(){
        System.out.println("Eu falo russo");
    }
}

class ClasseB extends ClasseA{

    @Override
    public void falar(){
        System.out.println("Eu Falo Ingles");
    }
}