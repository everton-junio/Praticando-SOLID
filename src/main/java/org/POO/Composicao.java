package org.POO;

//Ligação FORTE um se tirar um o código quebra
public class Composicao {
    EuFacoParte euFacoParte;

    public Composicao(){
        euFacoParte = new EuFacoParte("cleber");
    }
}

class EuFacoParte{
    String nome;

    public EuFacoParte(String nome){
        this.nome = nome;
    }

    public void mostrar(){
        System.out.println("Aqui olha so");
    }
}