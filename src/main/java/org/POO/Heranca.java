package org.POO;

public class Heranca {
    static void main(){
        Filho filho = new Filho();
        filho.mostrar();
        filho.setSeiIngles(true);
        System.out.println("Sei ingles? " + filho.getIngles());
    }
}

class OlhosVerdes{
    private boolean seiIngles;
    public void mostrar(){
        System.out.println("Tenho olhos verdes");
    }
    public void setSeiIngles(boolean seiIngles){
        this.seiIngles = seiIngles;
    }
    public boolean getIngles(){
        return seiIngles;
    }
}

class Filho extends OlhosVerdes{

}