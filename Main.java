import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        
        Conta conta1 = new Conta();
        conta1.saldo = 10;
        conta1.atualiza(1.5);
        System.out.println(conta1.saldo);
    }

}
