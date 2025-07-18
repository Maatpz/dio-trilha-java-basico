package entrega;

import pizzaria.Pizza;

public interface EntregaStrategy {
    void entregar(Pizza pizza);
}