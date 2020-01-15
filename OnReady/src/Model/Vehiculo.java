package Model;



public abstract class Vehiculo implements Comparable<Vehiculo> {
    protected String marca;
    protected String modelo;
    protected double precio;
    protected int centavo;


    public Vehiculo(String marca, String modelo, double precio, int centavo) {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.centavo=centavo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCentavo() {
        return centavo;
    }

    public void setCentavo(int centavo) {
        this.centavo = centavo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }


    public String fullDescription(){
        return descripcion("Marca",this.getMarca())
                + descripcion("Modelo",getModelo());
    }

    public  String descripcion(String nombreCaract, String caracteristica){
        return  nombreCaract+":".concat(caracteristica).concat("//");
    }



    @Override
    public int compareTo(Vehiculo v) {
       return precio==v.getPrecio()?0:precio<v.getPrecio()?1:-1  ;
    }

}
