package entidades;

public class Shampoo extends Producto {

    private Integer contenido;

    public Shampoo(String nombre, Integer contenido, Integer precio) {
        this.contenido = contenido;
        super.nombre = nombre;
        super.precio = precio;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombre + " /// " + "Contenido: " + this.contenido + "ml" + " /// " + "Precio: $" + super.precio;
    }

}
