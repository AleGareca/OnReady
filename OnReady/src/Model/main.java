package Model;

public class main {

    public static void main(String[] args){
    Vehiculo auto1=new Auto("Peugeot","206","4",200.000,00);
    Vehiculo auto2=new Auto("Peugeot","208","4", 250.000, 00);
    Vehiculo moto1=new Moto("Honda","Titan","126c",60.000,00);
    Vehiculo moto2=new Moto("Yamaha","YBR","160c",80.500,50);

    Concesionaria concesionaria= new Concesionaria();

    concesionaria.agregarVehiculo(auto1);
    concesionaria.agregarVehiculo(moto1);
    concesionaria.agregarVehiculo(auto2);
    concesionaria.agregarVehiculo(moto2);

    concesionaria.imprimirDescripcionDeVehiculos();
    System.out.println("===================================");

    concesionaria.imprimirVehiculoMasCaro();
    concesionaria.imprimirVehiculoMasBarato();
    concesionaria.imprimirVehiculoConUnCaracterYEnELModelo();
    System.out.println("===================================");
    concesionaria.imprimirVehiculosSegunSuPrecio();

    }
}
