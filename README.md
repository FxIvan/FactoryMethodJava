# Factory Method en Java

Este proyecto implementa el patrón de diseño Factory Method en Java para la creación de objetos de tipo `Pizza` mediante una clase fábrica (`PizzeriaCF`).

## Descripción

El Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crean. En este caso, la clase `PizzeriaCF` se encarga de instanciar diferentes tipos de pizzas sin que el código cliente (el `main`) tenga que conocer los detalles de implementación.

## Estructura del Código

### 1. **Clase `Pizza`**
   - Es la clase base que representa una pizza.
   - Se espera que tenga una implementación del método `toString()` para representar su estado en texto.

### 2. **Subclases de `Pizza`**
   - Ejemplo: `PizzaPepperoni`, `PizzaHawaiana`, `PizzaMexicana`, `PizzaPeperoniOrillaRellena`.
   - Cada una extiende `Pizza` y puede sobrescribir su comportamiento.

### 3. **Clase `PizzeriaCF`**
   - Actúa como la fábrica de pizzas.
   - Tiene el método `crearPizza(String tipo)`, que devuelve una instancia de la clase de pizza correspondiente.

### 4. **Clase `App`**
   - Contiene el método `main` donde se usa la fábrica para crear y mostrar las pizzas.
   - Se llama a `System.out.println(pizza)`, lo que internamente invoca `toString()` de la clase `Pizza` o de sus subclases.

## Uso de `toString()`

Cuando se ejecuta `System.out.println(peperoni);`, Java automáticamente llama al método `toString()` de la instancia `peperoni`. Si `Pizza` o sus subclases sobrescriben `toString()`, se mostrará la representación definida en esa implementación.

Si `toString()` no está sobrescrito en `Pizza` o en sus subclases, la salida será el identificador del objeto en memoria (por defecto, `getClass().getName() + "@" + Integer.toHexString(hashCode())`).

## Ejemplo de Uso
```java
public class App {
    public static void main(String[] args) {
        PizzeriaCF cf = new PizzeriaCF();

        Pizza peperoni = cf.crearPizza("Pepperoni");
        Pizza hawaiana = cf.crearPizza("Hawaiana");

        System.out.println(peperoni); // Llama a toString()
        System.out.println(hawaiana);
    }
}
```

## Conclusión
El patrón Factory Method permite crear objetos de manera flexible y desacoplar la lógica de instanciación del código cliente. En este caso, `PizzeriaCF` maneja la creación de diferentes tipos de `Pizza`, simplificando el código en `App` y facilitando la ampliación del sistema con nuevas pizzas sin modificar la lógica principal.

------

#### Uso de `super()`

El `super()` en `PizzaOrillaRellena` llama al constructor de la clase padre (`Pizza`). Es decir, cuando creas una instancia de `PizzaOrillaRellena`, primero se ejecuta el constructor de `PizzaOrillaRellena`, pero antes de ejecutar su propio código, `super(cantidadRebanadas, especialidad);` invoca el constructor de `Pizza` con esos parámetros.

##### ¿Por qué se usa `super()`?
- Para inicializar correctamente los atributos heredados de `Pizza`.
- Asegura que cualquier lógica del constructor de `Pizza` se ejecute antes de personalizar la subclase.

Si `Pizza` tiene un constructor como este:

```java
public class Pizza {
    protected int cantidadRebanadas;
    protected String especialidad;

    public Pizza(int cantidadRebanadas, String especialidad) {
        this.cantidadRebanadas = cantidadRebanadas;
        this.especialidad = especialidad;
    }
}
```

Entonces `PizzaOrillaRellena` hereda esa estructura, evitando repetir código innecesario.

