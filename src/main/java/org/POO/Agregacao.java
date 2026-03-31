package org.POO;
//ligacao meio forte, não preciso realmente dessa instãncia
public class Agregacao {
    private NaoFacoParte naoFacoParte;

    public Agregacao(NaoFacoParte naoFacoParte){
        this.naoFacoParte = naoFacoParte;
    }
}

class NaoFacoParte{
    private String nome;
    public NaoFacoParte(String nome){
        this.nome = nome;
    }
}