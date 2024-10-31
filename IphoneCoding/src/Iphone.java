public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico{
    
    //Navegador na Internet
    public void exibirPagina (String url) {
        System.out.println("EXIBINDO PÁGINA " + url);
    };
    public void adicionarNovaAba () {
        System.out.println("ADICIONANDO NOVA ABA");
    };
    public void atualizarPagina () {
        System.out.println("ATUALIZANDO PÁGINA");
    };
    
    //Aparelho Telefonico
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    };
    public void atender () {
        System.out.println("ATENDENDO");
    };
    public void iniciarCorreioDeVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    };

    // Reprodutor Musical
    public void tocar () {
        System.out.println("TOCANDO MÚSICA");
    }
    public void pausar () {
        System.out.println("PAUSANDO");
    }
    public void selecionarMusica (String musica) {
        System.out.println(musica + " SELECIONADA");
    }
}
