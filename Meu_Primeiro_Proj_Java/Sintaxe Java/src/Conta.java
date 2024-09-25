public class Conta {
    double saldo= 100.0;
    public void sacar(Double valor){
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        System.out.println(saldo);

        System.out.println(novoSaldo);
    }
}