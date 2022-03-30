package entidades;

public enum UnidadDeVenta {

    KILO(" kilo ");
    private String nombre;

    private UnidadDeVenta(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return nombre;
    }

}
