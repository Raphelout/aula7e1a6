public class Banco {
    public Conta[] arrayContas;

    public void tamanhobanco(int tamanho){
        arrayContas = new Conta[tamanho];
    }
    
    public void adiciona(Conta conta){

        for (int i=0; i<arrayContas.length; i++){
            if (arrayContas[i]==null){
                arrayContas[i] = conta;
                System.out.println("sua conta do tipo " + conta.getTipoconta() + " foi adicionado ao slot de contas " + i);
                break;
            } 
        }
    }
    public void pegaTotalDeContas(){
        for (int i=0; i<arrayContas.length; i++){
            if (arrayContas[i] != null){
                System.out.println("\nindice: " + i + "\ntipo: " + arrayContas[i].getTipoconta() + "\nsaldo: " + arrayContas[i].getSaldo());
            }
        }
    }

    public Conta pegaConta(int indice){
        return arrayContas[indice];
    }
}
