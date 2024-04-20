public class Telefono extends ArticuloElectronico implements Mostrables{


    private String CamaraPixeles;
    private String capacidadbateria;

    public String getCamaraPixeles() {
        return CamaraPixeles;
    }

    public void setCamaraPixeles(String camaraPixeles) {
        CamaraPixeles = camaraPixeles;
    }


    public Telefono(String nombre, String modelo, String ram, String almacenamiento, double preciobase, String camaraPixeles, String capacidadbateria, long codigo) {
        super(nombre, modelo, ram, almacenamiento, preciobase, codigo);
        CamaraPixeles = camaraPixeles;
        this.capacidadbateria = capacidadbateria;
    }

    public interface ObtenerPrecio{

    }


    public interface ObtenerDescripcion {

    }


    public String getCapacidadbateria() {
        return capacidadbateria;
    }

    public void setCapacidadbateria(String capacidadbateria) {
        this.capacidadbateria = capacidadbateria;
    }
}
