public class Usuario {
public static void main(String[] args) throws Exception {
    Conta smartTv = new Conta();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();

    smartTv.mudarCanal(13);
    System.out.println("Canal Atual: " + smartTv.canal);

    System.out.println("Volume Atual: " +smartTv.volume);
    
    System.out.println("TV Ligada?: " + smartTv.ligada);
    System.out.println("Canal Atual: " + smartTv.canal);
    System.out.println("Volume Atual: " + smartTv.volume);

    smartTv.ligar ();
    System.out.println("Novo Status -> TV Ligada?: " + smartTv.ligada);
}
}