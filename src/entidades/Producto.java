package entidades;

public abstract class Producto implements Comparable<Producto> {

    protected String nombre;

    protected Integer precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public int compareTo(Producto p) {

        if (precio < p.precio) {
            return 1;
        } else {
            return -1;
        }
    }

}
