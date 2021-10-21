
public class Dados {
    int posicao = 0;
    int tamanhoAtual = 4;
    Object[]dados;

    public Dados(){
        this.dados = new Object[tamanhoAtual];
    }

    public String add(Object obj){
        String mensagem;
        if(posicao < dados.length){
            dados[posicao]= obj;
            posicao++;           
        }else{
            tamanhoAtual = tamanhoAtual*2;
            Object[]dados2 = new Object[tamanhoAtual];

            for(int i=0; i<dados.length; i++){
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
        mensagem = "Salvo com sucesso"; 
        return mensagem;
    }

    public boolean contains(Object obj){

        for(int i=0; i< dados.length; i++){
            if(dados[i].equals(obj)){
                return true;
            }
        }
        return false;
    }

    public String remove(Object obj){
        String mensagem = "Não encontrado";
        for(int i =0; i<dados.length;i++){
            if(dados[i].equals(obj)){
                mensagem = "Removido com sucesso";
                posicao--;
                

            }
        }
        return mensagem;
    }

   
}
