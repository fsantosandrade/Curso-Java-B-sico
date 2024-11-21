public class MinhaClasse {
    public static void main (String [] args) {
        System.out.print("Iae rapazeada!");

        int ano = 2021;
        ano = 2022;

        //palavra reservada final para definir um valor imutável
        final String BR = "Brasil";

        //anatomia variáveis
        String primeiroNome = "Felipe";
        String segundoNome = "Santos";
        int anoFabricacao = 2022;
        boolean verdadeiro = true;

        //chamando o método nomeCompleto
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);  
        System.out.println(nomeCompleto);
    }

    //anatomia método
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
