package org.SOLID;

public class OpenClosedPrinciple {
    static void main(){
        DisplayPagamento displayPagamento = new DisplayPagamento(new Pix());
        DisplayPagamento displayPagamento2 = new DisplayPagamento(new Boleto());
        DisplayPagamento displayPagamento3 = new DisplayPagamento(new Cartao());


        displayPagamento.processarPagamento();
        displayPagamento2.processarPagamento();
        displayPagamento3.processarPagamento();

        //outra forma

        Pagamento pagamento = new Pix();
        pagamento.processarPagamento();
    }
}
class DisplayPagamento{
    private Pagamento pagamento;
    public DisplayPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    };

    public void processarPagamento(){
        pagamento.processarPagamento();
    }
}
interface Pagamento{
    void processarPagamento();
}

class Pix implements Pagamento{

    @Override
    public void processarPagamento() {
        System.out.println("Processando QR code");
    }
}
class Boleto implements Pagamento{

    @Override
    public void processarPagamento() {
        System.out.println("processando codigo de barras");
    }
}
// caso queira novo pagamento
class Cartao implements Pagamento{
    @Override
    public void processarPagamento(){
        System.out.println("Processando cartao");
    }
}