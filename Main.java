
public class Main {

    public static void main(String[] args){

        
        ///criação de conta
        Conta conta1 = new Conta();
        
        conta1.saldo = 10;
        conta1.atualiza(1);

        ///imprimir saldo do coitado
        System.out.println(conta1.saldo);

    }
}
