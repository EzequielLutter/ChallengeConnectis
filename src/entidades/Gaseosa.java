package entidades;

public class Gaseosa extends Producto {

    private Double litros;

    public Gaseosa(String nombre, Double litros, Integer precio) {
        this.litros = litros;
        super.nombre = nombre;
        super.precio = precio;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombre + " /// " + "Litros: " + this.litros + " /// " + " Precio: $" + super.precio;
    }

}
