package org.example;

public class LiskovSubstituitionPrinciple {
static void main(){
    Pai pai = new Pai();
    Filho filho = new Filho();
    pai.showDad();
    filho.showSon();
    filho.showDad();
}

}

class Pai{
    public void showDad(){
        System.out.println("Eu Tenho cabelo cacheado (igual meu pai)");
    }
}

class Filho extends Pai{
    public void showSon(){
        System.out.println("Eu Sou alto");
    }
}