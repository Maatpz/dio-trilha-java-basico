package pizzaria;

public class ConfiguracaoPizzaria {
    private static ConfiguracaoPizzaria instancia;
    private String nome;

    private ConfiguracaoPizzaria() {} // Construtor privado

    public static ConfiguracaoPizzaria getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoPizzaria();
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}