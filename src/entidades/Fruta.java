package entidades;

public class Fruta extends Producto {

    private UnidadDeVenta unidadDeVenta;

    public Fruta(String nombre, Integer precio, UnidadDeVenta unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
        super.nombre = nombre;
        super.precio = precio;
    }

    public UnidadDeVenta getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(UnidadDeVenta unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombre + " /// " + " Precio: $" + super.precio + " /// " + " Unidad de venta: " + this.unidadDeVenta;
    }

}
