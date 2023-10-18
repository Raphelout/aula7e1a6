import java.util.Scanner;
public class Conta {

    
    
    private static int quantcontas;
    protected double saldo;

    Scanner Leitor = new Scanner(System.in);

    public String getTipoconta() {
        return "conta";
    }
    public static void setQuantcontas(int quantcontas) {
        Conta.quantcontas = quantcontas;
    }
    public static int getQuantcontas() {
        return quantcontas;
    }
    public double getSaldo() {
        return saldo;
    }
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
    public void sacar(double quantiasaque){
        this.saldo -= quantiasaque;
    }
    public void deposita(){
            System.out.println("digite o valor que quer depositar");
            double quantdpo = Leitor.nextDouble();
            this.saldo += quantdpo;
    }



}
