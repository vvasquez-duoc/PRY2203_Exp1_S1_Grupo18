package exp1_s1_grupo18;

public class AdminDescuentos{
    private static AdminDescuentos instancia;

    private AdminDescuentos(){
    }

    public static AdminDescuentos obtenerInstancia(){
        if(instancia == null){
            instancia = new AdminDescuentos();
        }
        return instancia;
    }

    public int aplicarDescuento(int precioVenta, int porcentajeDescuento){
        return (int) Math.round(precioVenta - (precioVenta * porcentajeDescuento / 100));
    }
}