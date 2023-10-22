public class Contapoupanca extends Conta{
    
   
    public String getTipoconta() {
        return "poupança";
    }
    
    public void deposita(){
        System.out.println("digite o valor que quer depositar");
        double quantdpo = Leitor.nextDouble();
        this.saldo += quantdpo;
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa*3);

    }
}


