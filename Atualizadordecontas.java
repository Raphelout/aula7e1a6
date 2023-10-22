public class Atualizadordecontas {
    private double saldototal = 0;
    private double selic;

    public Atualizadordecontas(double selic){
        this.selic = selic;
    }
    public double getSaldototal() {
        return saldototal;
    }

    public void att(Conta conta){
        System.out.printf("\no saldo antigo da conta " + conta.getTipoconta() + ": " + "%.2f" + "R$\n", conta.getSaldo());
        conta.atualiza(this.selic);
        saldototal += conta.getSaldo();
        System.out.printf("o saldo novo da conta: "+ "%.2f" + "R$\n", conta.getSaldo() );
    }   
}

