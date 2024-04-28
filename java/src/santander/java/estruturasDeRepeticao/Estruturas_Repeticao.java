package santander.java.estruturasDeRepeticao;

class Estruturas_Repeticao {
    public static void main(String[] args) {
        double saldo = 500.00;
        double saque = 251.00;
        double saqueControlado = (saldo/100)*50; // sistema para risco de fraudes
        

        if (saque <= saqueControlado){
            double saldoAtual = saldo - saque;
            System.out.println("Saque realizado com sucesso! Seu saldo atual é: " + saldoAtual);
        }else{
            System.out.println("Seu pedido de Saque foi negado!");
        }
    }
}