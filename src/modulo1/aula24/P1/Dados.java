package P1; //falta consertar dados
public class Dados {
    private Object[] dados;
    private int tamanho = 5;
    private int posicao;


    public Dados(){
        this.dados = new Object[tamanho];
    }
    
    //diz a quantidade de ítens adicionados
    public int numItens(){
        return posicao;
    }

    public void adicionar(Object obj){
       verificaTamanhoArray();
       this.dados[posicao]=obj;
       posicao++;
    }
    private void verificaTamanhoArray(){
        if(posicao>=this.dados.length){
            int novoTamanho = this.dados.length+5;
            Object[]dados2 = new Object[novoTamanho];
            for(int i = 0; i<dados.length;i++){
                dados2[i]=dados[i];
            }
            dados = dados2;
        }
    }

    public String remover(Object obj){
        String mensagem = "Removido com sucesso";

        for(int i = 0; i < dados.length; i++){
            if(obj.equals(dados[i])){
                reorganizaArray(i);     
            }
        }
        return mensagem;
    }

    //metodo pra verificar se algo ja existe no array
    public boolean existe(Object obj){
        return igual(obj);
    }

    public boolean igual(Object obj){
        for(int i = 0; i < dados.length; i++){
            if(obj.equals(dados[i])){   
                return true;  
            }
        }
        return false;
    }

    private void reorganizaArray(int pos){
        for(int i=pos; i<posicao; i++){
            dados[i]= dados[i+1];
        }
        posicao--;
    }

    public int buscar(Object obj){
        for(int i =0; i< posicao; i++){
            if(obj.equals(dados[i])){
                return i;
            }
        }
        return -1;
    }
}
