public class Contapoupanca extends Conta{
    
   
    public String getTipoconta() {
        return "poupança";
    }
    

    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa*3);

    }
}


