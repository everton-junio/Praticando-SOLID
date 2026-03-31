package org.POO;

import javax.xml.transform.Source;

public class Abstracao {
    static void main(){
        ClasseImplementadora1 classeImplementadora1 = new ClasseImplementadora1();
        classeImplementadora1.acao("Oi");
        classeImplementadora1.masTambemPossoSerConcreta();

        ClasseImplementadora2 classeImplementadora2 = new ClasseImplementadora2();
        classeImplementadora2.acao("UAU");
        classeImplementadora2.masTambemPossoSerConcreta();
    }

}
class ClasseImplementadora1 extends ClasseAbstrata{

    @Override
    public void acao(String acao) {
        System.out.println(acao);
    }
}


class ClasseImplementadora2 extends ClasseAbstrata{

    @Override
    public void acao(String acao) {
        System.out.println(acao);
    }
}
abstract class ClasseAbstrata{
    public abstract void acao(String acao);

    public void masTambemPossoSerConcreta(){
        System.out.println("sou concreta");
    }
}