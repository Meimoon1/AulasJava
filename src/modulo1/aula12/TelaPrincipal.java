public class TelaPrincipal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Melissa");
        System.out.println(p.getNome());

        p.setSobrenome("Matos");
        String s = p.getSobrenome();
        System.out.println(s);

        p.setIdade(18);
        int i = p.getIdade();
        System.out.println(i);

        p.setCpf("07471219580");
        String c = p.getCpf();
        System.out.println(c);
    }



    
}
