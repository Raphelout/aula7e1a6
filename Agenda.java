public class Agenda {
    int quantamigos;
    int quantconhecidos;

    Pessoa[] pessoas;


    public Agenda(int quantpessoas){
        pessoas = new Pessoa[quantpessoas];

        for (int i=0; i<pessoas.length; i++){
            int randomnum = (1 + (int)(Math.random() * 2));
            if (randomnum==1){
                Amigo pessoas[i] = new Pessoa(); 
            }
            else {
                if (randomnum==2){
                    Conhecido pessoas[i] = new Pessoa();
                }

            }
        }
    }
    public Agenda(){
    }

}
