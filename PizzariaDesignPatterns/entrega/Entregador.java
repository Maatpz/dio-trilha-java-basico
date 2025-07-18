package entrega;

import pizzaria.Pizza;

public class Entregador {
    private EntregaStrategy strategy;

    public void setStrategy(EntregaStrategy strategy) {
        this.strategy = strategy;
    }

    public void entregar(Pizza pizza) {
        if (strategy != null) {
            strategy.entregar(pizza);
        } else {
            System.out.println("Nenhuma entrega definida.");
        }
    }
}