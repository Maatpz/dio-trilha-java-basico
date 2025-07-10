// Main.java
public class Main {
    public static void main(String[] args) {
        iphone meuIphone = new iphone();

        // Teste Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        // Teste Aparelho Telefônico
        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste Navegador Internet
        meuIphone.exibirPagina("https://apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
