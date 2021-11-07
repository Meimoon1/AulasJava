package view;

import controller.PessoaController;
import model.Pessoa;

public class PessoaView{
    public static void main(String[] args) {
        PessoaController pc = new PessoaController();
        Pessoa p1 = new Pessoa();

        p1.id = 2;
        p1.nome = "Manuella";
        p1.sobrenome = "Silva";
        pc.create(p1);

        for (Object p : pc.read()) {
           System.out.println(p); 
        }

        pc.delete(p1);
        System.out.println("Deletando");
        
        for (Object p : pc.read()) {
            System.out.println(p); 
         }

    }
}
