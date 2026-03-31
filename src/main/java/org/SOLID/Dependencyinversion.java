package org.SOLID;

import java.util.ArrayList;
import java.util.List;

public class Dependencyinversion {
    static void main(){
        List<SouMoldavel> lista = new ArrayList<>();
        lista.add(new Heroi());
        lista.add(new Gato());
        lista.add(new Australopitecus());

        for (int i = 0; i < lista.size(); i++){
            MostrarAcao mostrarAcao = new MostrarAcao(lista.get(i));
            mostrarAcao.SouMoldavelENAoPrecisoDeAlteracao();
        }
    }
}

interface SouMoldavel{
    void acao();
}

class Heroi implements SouMoldavel{

    @Override
    public void acao() {
        System.out.println("Eu sou um Heroi!!");
    }
}

class Gato implements SouMoldavel{

    @Override
    public void acao() {
        System.out.println("Agora eu sou um GATO!!!");
    }
}

class MostrarAcao{
    private final SouMoldavel souMoldavel;
    public MostrarAcao(SouMoldavel souMoldavel){
        this.souMoldavel = souMoldavel;
    }
    public void SouMoldavelENAoPrecisoDeAlteracao(){
        souMoldavel.acao();
    }
}

//Caso eu queira um novo

class Australopitecus implements  SouMoldavel{

    @Override
    public void acao() {
        System.out.println("QUe criatividade boa, agora sou um australopitecus");
    }
}