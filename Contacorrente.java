import java.util.Scanner;

public class Contacorrente extends Conta{

    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;

    }
    public void deposita(){
            Scanner Leitor = new Scanner(System.in);
            System.out.println("digite o valor que quer depositar");
            double quantdpo = Leitor.nextDouble();
            this.saldo += quantdpo - 0.10;
            Leitor.close();
    }
}
