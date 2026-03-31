package org.POO;

public class Polimorfismo {
    static void main(){
        Mistica quemSera = new Wolverine();
        Mistica quemSera2 = new CiclopeGoat();

        quemSera.revelar();
        quemSera2.revelar();
    }
}

class Mistica{
    public void revelar(){
        System.out.println("Agora eu sou o: "+ getClass().getName());
    }
}

class Wolverine extends Mistica{}
class CiclopeGoat extends Mistica{}