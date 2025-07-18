package pizzaria;

public class PizzaFactory {
    public static Pizza criarPizza(String tipo) {
        switch (tipo.toLowerCase()) {
            case "mussarela":
                return new PizzaMussarela();
            case "calabresa":
                return new PizzaCalabresa();
            default:
                throw new IllegalArgumentException("Tipo de pizza desconhecido: " + tipo);
        }
    }
}