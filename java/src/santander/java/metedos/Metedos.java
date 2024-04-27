package santander.java.metedos;

public class Metedos {
    // Devem ser nomeados como verbo
    // seguir padrão camelCase
    // deve ter uma unica responsabilidade
    // visibilidade: toda aplicaão ; herança ; pacotes ; classes
    // se o metedo recebe muitos parametros, pq não criar uma class/obj e usar no parametro
    
    /**     exemplos:
     * calcularImprimir (){} -- Aqui ele tem duas resposabilidade, que não é indicado
     * somar (int n1, int n2) {} -- metedo para somar 
     * concluirPensaamento () {}
     * abrirConexao () {}
     */

     // METEDO PUBLICO COM O NOME 'SOMAR' RETORNA UM DOUBLE E ESPERA DOIS PARAMETROS
     public double somar (int n1, int n2){
        //AQUI VEM A LOGICA DO METEDO
        return 0;
     }

     //METEDO PUBLICO VOID (SEM RETORNO) COM NOME IMPRIMIR E ESPERA UMA STRING NO PARAMETRO
     public void imprimirAlgo (String texto){
        //logica do metedo
     }

     //metedo privado com uma exceção, para dividir algo e retorna um double
     private double dividir (int dividendo, int divisor) throws Exception {}



}
