package entrega;

import pizzaria.Pizza;

public class EntregaRapida implements EntregaStrategy {
    @Override
    public void entregar(Pizza pizza) {
        System.out.println("Entregando rapidamente: " + pizza.getDescricao());
    }
}