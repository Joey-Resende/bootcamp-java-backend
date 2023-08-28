public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("*** Primeira Interação do Usúario ***");
        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------");

        System.out.println("*** Segunda Interação do Usúario ***");
        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------");

        System.out.println("*** Terceira Interação do Usúario ***");
        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(9);
        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------");

    }
}
