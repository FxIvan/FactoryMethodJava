public class Pizza {
    private int cantidadRebanadas;
    private String especialidad; // Nuevo Atributo

    public Pizza(int cantidadRebanadas, String especialidad) { // Constructor tiene dos parametros
        this.cantidadRebanadas = cantidadRebanadas;
        this.especialidad = especialidad;
    }

    public String toString() {
        return "Pizza cantidadRebanadas:" + cantidadRebanadas + ", especialidad:" + especialidad;
    }
    
}
