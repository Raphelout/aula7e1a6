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
        System.out.println("\no saldo antigo da conta " + conta.getTipoconta() + ":" + conta.getSaldo());
        conta.atualiza(this.selic);
        saldototal += conta.getSaldo();
        System.out.println("o saldo novo da conta: "+ conta.getSaldo() );
    }   
}

