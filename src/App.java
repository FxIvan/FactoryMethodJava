public class App {

    // Subclase decida que clase instancia de la clase
    // Mediante una clase generar un objeto de otra clase
    // Interface
    public static void main(String[] args) throws Exception {
        PizzeriaCF cf = new PizzeriaCF();

        Pizza peperoni = cf.crearPizza("Pepperoni");
        Pizza hawaiana = cf.crearPizza("Hawaiana");
        Pizza mexicana = cf.crearPizza("Mexicana");
        Pizza orillaRellena = cf.crearPizza("PeperoniOrillaRellena");

        System.out.println(peperoni);
        System.out.println(hawaiana);
        System.out.println(mexicana);
        System.out.println(orillaRellena);
    }
}
