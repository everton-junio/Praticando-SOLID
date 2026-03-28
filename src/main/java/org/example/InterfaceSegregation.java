package org.example;

public class InterfaceSegregation {
    static void main(){
        Ave ave = new Pombo();
        AveQueNaoVoa aveQueNaoVoa = new Pinguim();

        ave.acao();
        aveQueNaoVoa.acao();
    }
}

interface Ave{
    void acao();
}
interface AveQueNaoVoa{
    void acao();
}

class Pinguim implements AveQueNaoVoa{

    @Override
    public void acao() {
        System.out.println("Não sou obrigado a VOAR!!!");
    }
}

class Pombo implements Ave{

    @Override
    public void acao() {
        System.out.println("Não sou obrigado a CORRER!!!");
    }
}