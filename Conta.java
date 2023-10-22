import java.util.Scanner;
abstract public class Conta {
  
    private static int quantcontas;
    protected double saldo;

    Scanner Leitor = new Scanner(System.in);

    abstract public String getTipoconta();
    abstract public void deposita();

    public static void setQuantcontas(int quantcontas){
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

}
