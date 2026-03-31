package org.StaticFInal;

public class StaticClass {
    void main(){
        System.out.println("_______METHOD_STATIC_DONT_NEED_INSANCE_______");
        Classe.dizerOI();
        System.out.println("_______CLASSIC_ATRIBUTE_DIFF_OBECTS_______");
        AtbtNaoStatic atbtNaoStatic = new AtbtNaoStatic();
        atbtNaoStatic.counter(); // result = 0
        AtbtNaoStatic atbtNaoStatic2 = new AtbtNaoStatic();
        atbtNaoStatic2.counter(); // result = 0
        System.out.println("_______STATIC_ATRIBUTE_DIFF_OBECTS_______");
        AtbtStatic atbtStatic = new AtbtStatic();
        atbtStatic.counter(); //result = 0
        AtbtStatic atbtStatic2 = new AtbtStatic();
        atbtStatic2.counter();//result = 1
    }
}

//Static Pertence à classe, não ao objeto.

// numa classe so funciona na filha pois a classe PAI ja é desvinculada
class Pai{
    static class Filho{
    }
}

//num metodo, o mesmo pode ser chamado sem intanciar o objeto, o metodo pertence a classe não a intancias.
class Classe{
    public static void dizerOI(){
        System.out.println("Oi");
    }
}

//em um atributo o mesmo se torna fixo para todos os objetos
class AtbtNaoStatic{
    private int i = 0;
    public void counter(){
        System.out.println(i);
        i++;
    }
}

class AtbtStatic{
    private static int i = 0;
    public void counter(){
        System.out.println(i);
        i++;
    }
}

