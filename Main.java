
public class Main {

    public static void main(String[] args){

        
        ///criação de conta
        Conta contaco = new Contacorrente();
        Conta contapo = new Contapoupanca();

        Atualizadordecontas atualizador = new Atualizadordecontas(0.05);
        
        contaco.deposita();
        contapo.deposita();
        
        
        ///imprimir saldo do coitado
        System.out.println(contaco.saldo);
        atualizador.att(contaco);
        atualizador.att(contapo);
        System.out.println(atualizador.getSaldototal());
    }
}
