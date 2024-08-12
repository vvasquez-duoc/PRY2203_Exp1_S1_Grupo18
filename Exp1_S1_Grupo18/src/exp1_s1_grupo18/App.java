package exp1_s1_grupo18;

public class App{
    public static void main(String[] args) {
        AdminDescuentos adminDescuentos = AdminDescuentos.obtenerInstancia();

        int precioVenta = 23990;
        int porcentajeDescuento = 35;

        int precioConDescuento = adminDescuentos.aplicarDescuento(precioVenta, porcentajeDescuento);

        System.out.println("Precio original: $"+precioVenta);
        System.out.println("Descuento aplicado: "+porcentajeDescuento+"%");
        System.out.println("Precio con descuento: $"+precioConDescuento);
    }
}
