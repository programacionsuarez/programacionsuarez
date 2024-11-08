package co.edu.uniquindio.poo.model;
import java.time.LocalDate;

public class Moto extends Vehiculo {
    public Caja caja;

    
    //Constructor
    public Moto(String placa, String marca, String modelo, LocalDate fechaFabricacion, Caja caja) {
        super(placa, marca, modelo, fechaFabricacion );
        this.caja = caja;
    }

    //Constructor vacio
    public Moto() {
    }

    //Getters y Setters
    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }


}