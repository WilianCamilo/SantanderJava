package santander.java.apredendoSintaxe;
public class CriandoMetedo_ChamandoNaVariavel {
    
    // Criei um metodo com o nome "nomeCOmpleto" onde recebe duas String como parametros
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metedo: " + primeiroNome.concat(" ").concat(segundoNome); // uso power class para concatenar ou o sinal de +  
    }

    // No metedo principal eu atribuir valores aos parametros e criei uma variavel que chama o metedo acima "nomeCompleto", já com os parametros atribuidos
    public static void main(String[] args) {
        String primeiroNome = "Wilian";
        String segundoNome = "Camilo";

        String meuNome = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(meuNome);

    }

}
