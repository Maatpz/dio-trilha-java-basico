import entrega.*;
import pizzaria.*;

public class Main {
    public static void main(String[] args) {
        // Singleton - Obtem a única instância da configuração da pizzaria
        ConfiguracaoPizzaria config = ConfiguracaoPizzaria.getInstance();
        config.setNome("Pizzaria_Pzz");

        // Factory - Cria uma pizza de mussarela
        Pizza pizza = PizzaFactory.criarPizza("mussarela");
        System.out.println("Pizza criada: " + pizza.getDescricao());

        // Strategy - Define e utiliza a estratégia de entrega rápida
        Entregador entregador = new Entregador();
        entregador.setStrategy(new EntregaRapida());
        entregador.entregar(pizza);

        // Strategy - Altera para entrega econômica
        entregador.setStrategy(new EntregaEconomica());
        entregador.entregar(pizza);
    }
}