public class Conta {

    protected double saldo;


    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }



    
}
