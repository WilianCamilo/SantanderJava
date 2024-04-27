package santander.java.operadores;

public class Operador_Ternario {

    public static void main (String [] args){

        /**
         *  + soma
         *  - subtração
         *  / divisão
         *  % resto
         *  ** exponencial
         *  -- decremento
         *  ++ encremento
         *  = atribuição
         *  != verifica se é diferente
         *  == verifica se tem o mesmo valor
         *  === verifica o tipo e o valor, se são identicos
         * ! negação
         *  > maior
         *  < menor
         *  >= maior igual
         *  <= menor igual
         *  && and
         *   || or
         */

            int a, b;
            a = 5;
            b = 6;
            String resultado = (a==b) ? "Verdadeiro " : "Falso"; // operador ternario
            System.out.println(resultado);
    }
}
