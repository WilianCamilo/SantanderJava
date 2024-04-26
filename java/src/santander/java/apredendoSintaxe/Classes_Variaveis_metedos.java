package santander.java.apredendoSintaxe;
public class Classes_Variaveis_metedos {

/** Nome da Classe no Arquivo, nesse   caso "App"
* Caso tenha nome composto o segundo nome inicia maiusculo ex: " AltoFalante"
*/


    // ********** variaveis *********

    int ano = 2024;
    String mesAtual = "Abril"; // variaveis com nomes compostos
    int ano_Atual = 2024;
    int valor$mensal = 10;

    String MEUNOME = "Wilian Camilo"; // variaveis com letradas maiusculas se tornam inalterável
    final double PI = 3.14;           // Outro modelo de variaveis inalterável
    final int ESTADOS_BRASILEIROS = 27; // mais um exemplo

//exemplos de veriaveis invaidas e validas
     
int numero&zero = 0;  // incorreto, pode apenas $ ou _
int numero$zero = 0;  // correto

int 3numero = 3;     // incorreto, não pode iniciar com numeros
int numero3 = 3;     // correto

int numero um = 1;   // incorreto, não pode ter espaço
int numero_um = 1;   // correto

int long = 10;       // incorreto "long" já é reservada
int longo = 10;     // correto


    public static void main(String[] args) {
        System.out.println("Hello, World!!");
    }

}
