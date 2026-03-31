package org.StaticFInal;

public class FinalClass {
}

//Final Impede alteração.

//Final em class, a classe não pode mais ser heradada
final class Final{

}

//final class Final2 extends Final{} Cannot inherit from final class 'org.StaticFInal.Final'

//Final em metodo, o metodo não pode ser sobrecrito

class TenhoDoisMetodosMasSoPodeSobrescreverUm{
    public void mostraDia(){};
    public final void BloqueioMostraDia(){}
}

class Coabaia extends TenhoDoisMetodosMasSoPodeSobrescreverUm{
    public void mostraDia(){}
    //public void BloqueioMostraDia(){} BloqueioMostraDia()' cannot override 'BloqueioMostraDia()' in 'org.StaticFInal.TenhoDoisMetodosMasSoPodeSobrescreverUm'; overridden method is final

}

//Final em atributo significa que ele não pode ser alterado
class NaoAltereMeuNumero{
    public final int num = 0;
    public void tentadno(){
//        num +=1; Cannot assign a value to final variable 'num'
    }
}