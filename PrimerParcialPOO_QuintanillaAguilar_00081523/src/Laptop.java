public class Laptop  extends  ArticuloElectronico implements Mostrables{

    private String TarjetaGrafica;
    private String procesador;

    public Laptop(String nombre, String modelo, String ram, String almacenamiento, double preciobase,String tarjetaGrafica, String procesador) {
        super(nombre, modelo, ram, almacenamiento, preciobase);
        TarjetaGrafica = tarjetaGrafica;
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return TarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        TarjetaGrafica = tarjetaGrafica;
    }

    public double ObtenerPrecio() {
        return 0;
    }


    public void ObtenerDescripcion() {

    }


}
