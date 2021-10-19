
public class Main{
    public static void main(String[] args) {
     
        Pessoa p1 = new Pessoa();
        p1.nome = "Amy";
        p1.sobrenome = "Lee";

        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";

        Dados dados = new Dados();
        System.out.println(dados.add(p1));  
        System.out.println(dados.add(c1)); 
        System.out.println(dados.add(p1)); 
        System.out.println(dados.add(c1));
        System.out.println(dados.add(p1)); 
        System.out.println(dados.add(c1));
        
        System.out.println(dados.contains(c1));
        System.out.println(dados.contains(p1));
    }
}