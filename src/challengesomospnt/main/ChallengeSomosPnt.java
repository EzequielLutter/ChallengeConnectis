package challengesomospnt.main;

import entidades.Fruta;
import entidades.Gaseosa;
import entidades.Producto;
import entidades.Shampoo;
import static entidades.UnidadDeVenta.KILO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChallengeSomosPnt {

    public static void main(String[] args) {

        List<Producto> productos = cargarProductos();

        productos.forEach(p -> System.out.println(p));

        System.out.println("============================");

        Collections.sort(productos);
        System.out.println("Producto mas caro: " + productos.get(0).getNombre());

        Collections.sort(productos, Collections.reverseOrder());
        System.out.println("Producto mas barato: " + productos.get(0).getNombre());
    }

        private static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList();
        Producto cocaCola1 = new Gaseosa("Coca-Cola Zero", 1.5, 20);
        Producto cocaCola = new Gaseosa("Coca-Cola", 1.5, 18);
        Producto shampoo = new Shampoo("Shampoo Sedal", 500, 19);
        Producto frutilla = new Fruta("Frutilla", 64, KILO);
        productos.add(cocaCola1);
        productos.add(cocaCola);
        productos.add(shampoo);
        productos.add(frutilla);
        return productos;
    }

}
