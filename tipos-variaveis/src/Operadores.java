public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; // 31 because it sums the first three numbers and then concatenate the last one

        concatenacao = 1+"1"+1+1;

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);

        // Ternary operators
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        // Relational operators
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 != numero2;

        System.out.println("Número 1 é igual a número 2? " + simNao);

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        // Relational with Strings
        String nomeUm = "Bryan";
        String nomeDois = new String ("Bryan");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois)); // For objects use "equals" instead of ==

        // Logical operators OR AND
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
