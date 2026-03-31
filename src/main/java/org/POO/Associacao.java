package org.POO;
//Fds mermão só quero seu tipo
public class Associacao {
    static void main(){
        chamandoMetodo(new EuPossoSerDescartado());
    }

    public static void chamandoMetodo(EuPossoSerDescartado euPossoSerDescartado){
        euPossoSerDescartado.print();
    }

}
class EuPossoSerDescartado{
    public void print(){
        System.out.println("Olaaaa");
    }
}
