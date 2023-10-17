public class Contacorrente extends Conta{
    

    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa*2);
    }
}
