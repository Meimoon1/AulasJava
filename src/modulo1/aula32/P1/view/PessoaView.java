package view;

import controller.PessoaController;
import model.Pessoa;

public class PessoaView{
    public static void main(String[] args) {
        PessoaController pc = new PessoaController();
        Pessoa p1 = new Pessoa();

        p1.id = 6;
        p1.nome = "Joanne";
        p1.sobrenome = "Costa";
        pc.create(p1);

        for (Object p : pc.read()) {
           System.out.println(p); 
        }

        pc.delete(p1);
        System.err.println("Deletando");

        for (Object p : pc.read()) {
            System.out.println(p); 
         }

         p1.id = 4;
         p1.nome = "Barbie";
         p1.sobrenome = "Girl";
         pc.update(p1);
         
         System.err.println("Alterado");
         for (Object p : pc.read()) {
            System.out.println(p); 
         }


    }
}
