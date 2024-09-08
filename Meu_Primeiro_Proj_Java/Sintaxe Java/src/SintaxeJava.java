public class SintaxeJava {//casse
    public static void main(String[] args) throws Exception{
        double salarioMinino = 2.500; //não é 2500 e sim 2,5

        //exemplos de tipos de variaves
        byte idade = 123;
        short ano = 2024;
        int cep = 13478779; //se começar com "0" precisa ser string
        long cpf = 40465143881L; //se começar com "0" precisa ser string e sempre terminar em L
        float pi = 3.14F; //terminar com F sempre
        double salario = 1275.33; //Java não utiliza "," para separar casas decimais e sim ponto

        //comportamento tipos de valores numericos
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //quase não é feito "casting"

        final double VALOR_DE_PI = 3.14;

        System.out.println(cpf);
    }
    }