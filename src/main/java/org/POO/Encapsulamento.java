package org.POO;

public class Encapsulamento extends SoDosMeus{


    static void main(){
        Restrito restrito = new Restrito();
        SoDosMeus soDosMeus = new SoDosMeus();
        Comunismo comunismo = new Comunismo();

        //System.out.println(restrito.senha);
        System.out.println(soDosMeus.senha);
        System.out.println(comunismo.senha);
    }
}

class Restrito{
    private String senha = "Segredo";
}

class SoDosMeus{
    protected String senha = "Essa só vc é dos meus";
}

class Comunismo{
    public String senha = "Visshhhh";
}