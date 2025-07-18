package entrega;

import pizzaria.Pizza;

public class EntregaEconomica implements EntregaStrategy {
    @Override
    public void entregar(Pizza pizza) {
        System.out.println("Entrega econômica: " + pizza.getDescricao());
    }
}