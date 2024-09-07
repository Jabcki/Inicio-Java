public class SintaxeJava {
        String meuNome = "William";
        int anoNascimento = 1991;
        boolean verFal;
        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
        }
        public static void main(String[] args) {
            String primeiroNome = "Wlliam";
            String segundoNome = "Jonas";
            String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

            System.out.println(nomeCompleto);
        }
    }