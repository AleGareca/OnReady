package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(){
        this.vehiculos= new ArrayList<Vehiculo>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    public void removerVehiculo(Vehiculo v){
        vehiculos.remove(v);
    }
    public void agregarVehiculos(ArrayList<Vehiculo> vs){
        vehiculos.addAll(vs);
    }

    public void imprimirDescripcionDeVehiculos() {
        vehiculos.stream().forEach(v->this.imprimirDescripcionDeVehiculo(v));
    }

    public void imprimirDescripcionDeVehiculo(Vehiculo v) {
            System.out.println(v.fullDescription());
    }

    public Vehiculo vehiculoMasCaro(){
        ArrayList<Vehiculo> ls= vehiculos;
        Collections.sort(ls);
        return ls.get(0);
    }

    public Vehiculo vehiculoMasBarato(){
        ArrayList<Vehiculo> ls= vehiculos;
        Collections.sort(ls);
        return ls.get(ls.size()-1);
    }

    public  void imprimirVehiculoMasCaro(){
        System.out.println("Vehículo más caro:"+vehiculoMasCaro().getMarca()+ " "+vehiculoMasCaro().getModelo());
    }

    public  void imprimirVehiculoMasBarato(){
        System.out.println("Vehículo más Barato:"+vehiculoMasBarato().getMarca()+ " "+vehiculoMasBarato()
                .getModelo());
    }

    public Vehiculo vehiculosConAlgunCaracterEnElModelo(String x) {
        Vehiculo  res=null;

        for (Vehiculo v : vehiculos) {
            if (v.getModelo().contains(x)) {
                res= v;
            }
        }
       return res;
    }
    public void imprimirVehiculoConUnCaracterYEnELModelo(){
        System.out.println("Vehículo que contiene en el modelo la letra 'Y' :" +
                this.vehiculosConAlgunCaracterEnElModelo("Y").getMarca()+
                " "+ this.vehiculosConAlgunCaracterEnElModelo("Y").getModelo());
    }


    public void imprimirVehiculosSegunSuPrecio() {
        ArrayList<Vehiculo> ls= vehiculos;
        Collections.sort(ls);

        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Vehiculo v:ls) {
            System.out.println(v.getMarca() +" "+ v.getModelo());
        }
    }
}
