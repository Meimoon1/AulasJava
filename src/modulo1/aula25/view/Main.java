package view;

import models.Endereco;
import models.PessoaFisica;

public class Main {
    public static void main(String[] args) {
    PessoaFisica pf = new PessoaFisica();
   /* pf.enderecoResidencial.logadouro = "Avenida Jk";
    pf.enderecoResidencial.numero = "8898";
    pf.enderecoResidencial.complemento= "Apto 23";
    pf.enderecoResidencial.cep = "99800090";
    pf.enderecoResidencial.cidade = "Feira de Santana";
    pf.enderecoResidencial.estado = "Bahia";
    pf.enderecoComercial = pf.enderecoResidencial;*/

    //ou quando o endereço residencial é o mesmo do comercial

    Endereco end1 = new Endereco();
    end1.logadouro = "Av jK";
    end1.numero = "8878";
    end1.complemento = "apt 3";
    end1.cep = "898393";
    end1.cidade = "Feira";
    end1.estado = "Bahia";

    pf.enderecoResidencial = end1;
    pf.enderecoComercial = end1;

    System.out.println(pf.enderecoComercial.logadouro);
    System.out.println(pf.enderecoResidencial.logadouro);

    
    


    }
}
