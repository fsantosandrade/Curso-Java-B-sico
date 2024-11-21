import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salarioMinimo = 2.5;
        boolean falso = false;

        //Outro tipos
        String nome = "Felipe";
        char sexo = 'M';
        Date dataNascimento = new Date(2022);

        //casting
        short numeroCurto1 = 1;
        int numeroNormal = numeroCurto1;
        short numeroCurto2 = (short) numeroNormal;
    }
}
