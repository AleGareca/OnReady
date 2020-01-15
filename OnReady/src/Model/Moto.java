package Model;

public class Moto extends Vehiculo {
    private String cilindrada;
    public Moto(String marca, String modelo,String cilindrada, double precio, int centavo) {
        super(marca, modelo, precio,centavo);
        this.cilindrada=cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String fullDescription() {
        return super.fullDescription()+super.descripcion("Cilindrada",this.cilindrada)+
                super.descripcion("Precio","$"+this.precio+","+this.centavo);
    }

}
