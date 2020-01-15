package Model;

public class Auto extends Vehiculo {
    private  String puertas;
    public Auto(String marca, String modelo, String puertas, double precio, int centavo) {
        super(marca, modelo, precio,centavo);
        this.puertas=puertas;
    }


    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    @Override
    public String fullDescription() {
        return super.fullDescription()+super.descripcion("Puertas",this.puertas)+
                super.descripcion("Precio","$"+this.precio+","+this.centavo);
    }

}
