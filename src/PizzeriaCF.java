// Este es el Factory
public class PizzeriaCF implements IPizzeria {
    public Pizza crearPizza(String tipo) {
        if (tipo.equals("Pepperoni")) {
            return new Pizza(8, "Pepperoni");
        }
        if (tipo.equals("Hawaiana")) {
            return new Pizza(8, "Hawaiana");
        }
        if (tipo.equals("Mexicana")) {
            return new Pizza(8, "Mexicana");
        } 
        
        if (tipo.equals("PeperoniOrillaRellena")) {
            return new PizzaOrillaRellena(12, "PeperoniOrillaRellena"); //
        }
        
        return null;
    }
    
}
