

public class Contacorrente extends Conta{
    
    
    ///informa o tipo da conta caso seja necessario(e foi)
    public String getTipoconta() {
        return "corrente";
    }

    //
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa*2);
    }

    ///toda vez que for instanciado, aumenta a quantidade de contas em 1
    public Contacorrente(){
        Conta.setQuantcontas(getQuantcontas() + 1);
    }


    ///deposita diferente do Conta porque ele tira 10 centavos de cada deposito, um roubo
    public void deposita(){ 
            System.out.println("\ndigite o valor que quer depositar");
            double quantdpo = Leitor.nextDouble();
            this.saldo += quantdpo - 0.10;
    }
}
