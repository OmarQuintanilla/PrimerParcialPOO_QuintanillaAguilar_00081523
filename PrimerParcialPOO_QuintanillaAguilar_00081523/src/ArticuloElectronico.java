public  abstract class ArticuloElectronico {
    private String nombre;
    private String modelo;
    private String ram;
    private String almacenamiento;

    private double Preciobase;
    private long codigo = 53845L;

    public ArticuloElectronico(String nombre, String modelo, String ram, String almacenamiento, double preciobase, long codigo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        Preciobase = preciobase;
        this.codigo = NuevoCodigo(codigo);
    }

    public ArticuloElectronico(ArticuloElectronico articulo){
        nombre = articulo.nombre;
        modelo = articulo.modelo;
        ram = articulo.ram;
        almacenamiento = articulo.almacenamiento;
        codigo = articulo.codigo;
        Preciobase = articulo.Preciobase;
    }

    public ArticuloElectronico(String nombre, String modelo, String ram, String almacenamiento, double precioBase) {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPreciobase() {
        return Preciobase;
    }

    public void setPreciobase(double preciobase) {
        Preciobase = preciobase;
    }

    public long NuevoCodigo(long codigo){
     return codigo++;
 }

}

