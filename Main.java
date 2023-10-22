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
        Conta contaco2 = new Contacorrente();
        Conta contapo2 = new Contapoupanca();
        bradesco.adiciona(contaco);
        bradesco.adiciona(contapo);
        bradesco.adiciona(contaco2);
        bradesco.adiciona(contapo2);

        System.out.println();
        
        //instancio o atualizador de contas e dou o selic de 0.05
        Atualizadordecontas atualizador = new Atualizadordecontas(0.05);
        
        ///deposito quanto dinheiro eu quiser usando o Scanner
        contaco.deposita();
        contapo.deposita();
        contaco2.deposita();
        contapo2.deposita();
        
        
        ///imprimir os dados do atualizador de contas
        for (int i = 0;i<bradesco.arrayContas.length; i++){
            if (bradesco.arrayContas[i] != null){
                atualizador.att(bradesco.arrayContas[i]);
            }
        }

        ///imprime o saldo total da conta, vulgo conta corrente + poupança somados
        System.out.println("\no saldo total da conta é: " + atualizador.getSaldototal());

        bradesco.pegaTotalDeContas();
        ///lê o saldo da conta usando o indice dela
        System.out.println("\nlendo o saldo da primeira conta corrente usando o indice: " + bradesco.pegaConta(0).getSaldo());

        ///fecha o leitor
        Leitor.close();
    }
}
