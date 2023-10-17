public class Conta {

    protected double saldo;


    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
    public void sacar(double quantiasaque){
        this.saldo -= quantiasaque;
    }
    public void depositar(double quantiadeposito){
        this.saldo += quantiadeposito;
    }



}
