public class App {
    public static void main(String[] args) throws Exception {
        //Operadores aritiméticos

        double soma = 10.5 + 15.7;
        int subtracao = 10 - 5;
        int multiplicacao = 20 * 2;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //Verifica o resto da divisão
        double resultado = (10 * 7) + (20/4);

        //Operadores unários

        int numero = 5; 
        numero = -numero; //Torna negativo
        numero++; //Incrementa 1 ao valor original
        numero--; //Decrementa 1 ao valor original

        boolean variavel = true;    
        variavel = !variavel; //Inverte o valor boolean

        //Operador ternário: (condição) ? (result 1) : (result 2)

        int a, b;

        a = 6;
        b = 6;
        String result = a==b ? "verdadeiro" : "falso";

        //Operadores relacionais

        int n1, n2;

        n1 = 1;
        n2 = 2;

        boolean simOuNao = n1 == n2; //Verifica se é igual
        simOuNao = n1 != n2; //Verifica se é diferente
        simOuNao = n1 > n2; //Verifica se o primeiro é maior que o segundo
        simOuNao = n1 < n2; //Verifica se o primeiro é menor que o segundo
        
        String nomeUm = "Felipe";
        String nomeDois = "Felipe";

        simOuNao = nomeUm.equals(nomeDois); //Verifica se os conteúdos de objetos ou textos são iguais

        //Operadores lógicos

        boolean condicao1 = true;   
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("as duas são verdadeiras");
        }else if(condicao1 || condicao2){
            System.out.println("uma delas é verdadeira");
        }else {
            System.out.println("as duas são falsas");
        }
    }
}
