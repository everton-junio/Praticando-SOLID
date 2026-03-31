package org.SobrescritaSobrecarga;

public class Sobrecarga {
    TodosMeusMetodosTemMesmaAssinatura todosMeusMetodosTemMesmaAssinatura = new TodosMeusMetodosTemMesmaAssinatura();
    void main(){
        todosMeusMetodosTemMesmaAssinatura.contar("A");
        todosMeusMetodosTemMesmaAssinatura.contar("A", "B");
        todosMeusMetodosTemMesmaAssinatura.contar("A", "B", "C");
    }
}

class TodosMeusMetodosTemMesmaAssinatura{
    public void contar(String a, String b){
        System.out.println("Aqui tem 2");
    }

    public void contar(String a){
        System.out.println("Aqui tem 1");
    }

    public void contar(String a, String b, String c){
        System.out.println("Aqui tem 3");
    }
}