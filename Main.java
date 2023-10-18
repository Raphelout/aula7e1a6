import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /// só pra dar um \n antes de tudo e ficar mais bonito no terminal
        System.out.println("");

        //abro o leitor para ficar bonitinho
        Scanner Leitor = new Scanner(System.in);
        
        ///criação de conta
        Banco bradesco = new Banco();

        ///escolher o tamanho do array de contas do banco
        bradesco.tamanhobanco(5);

        ///cria contas e aloca dentro da array do banco
        Conta contaco = new Contacorrente();
        Conta contapo = new Contapoupanca();
        bradesco.alocacontas(contaco);
        bradesco.alocacontas(contapo);

        //instancio o atualizador de contas e dou o selic de 0.05
        Atualizadordecontas atualizador = new Atualizadordecontas(0.05);
        
        ///deposito quanto dinheiro eu quiser usando o Scanner
        contaco.deposita();
        contapo.deposita();
        
        
        ///imprimir os dados do atualizador de contas
        atualizador.att(contaco);
        atualizador.att(contapo);

        ///imprime o saldo total da conta, vulgo conta corrente + poupança somados
        System.out.println("\no saldo total da conta é: " + atualizador.getSaldototal());

        ///fecha o leitor
        Leitor.close();
    }
}
