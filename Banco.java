public class Banco {
    Conta[] arrayContas;

    public void tamanhobanco(int tamanho){
        arrayContas = new Conta[tamanho];
    }
    
    public void alocacontas(Conta conta){

        for (int i=0; i<arrayContas.length; i++){
            if (arrayContas[i]==null){
                arrayContas[i] = conta;
                System.out.println("sua conta do tipo " + conta.getTipoconta() + " foi adicionado ao slot de contas " + i);
                break;
            } 
        }
    }
}
