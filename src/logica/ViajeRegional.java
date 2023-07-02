package logica;

import java.time.LocalDate;
import java.time.LocalTime;

public class ViajeRegional extends Viaje {

    public ViajeRegional(int ID, OrigenDestinos origen, OrigenDestinos destino, LocalDate fechaInicioViaje, LocalTime horaPartida, Embarcacion embarcacion, int duracion) {
        super(ID, origen, destino, fechaInicioViaje, horaPartida, embarcacion, duracion);
    }

    public ViajeRegional() {
    }
    
    public OrigenDestinos getOrigen() {
        return origen;
    }

    public void setOrigen(OrigenDestinos origen) {
        this.origen = origen;
    }

    public OrigenDestinos getDestino() {
        return destino;
    }

    public void setDestino(OrigenDestinos destino) {
        this.destino = destino;
    }

    public LocalDate getFechaInicioViaje() {
        return fechaInicioViaje;
    }

    public void setFechaInicioViaje(LocalDate fechaInicioViaje) {
        this.fechaInicioViaje = fechaInicioViaje;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    public Embarcacion getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Embarcacion embarcacion) {
        this.embarcacion = embarcacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(int precioXHora) {
        this.precioXHora = precioXHora;
    }

    public boolean isClasePremium() {
        return clasePremium;
    }

    public void setClasePremium(boolean clasePremium) {
        this.clasePremium = clasePremium;
    }

    @Override
    public void recaudarPrecio(double precioXHoras, int duracion, boolean clasePremium) {
        double precioBillete = 0; 
        precioXHoras = 57; 
        if(clasePremium){
            precioBillete = precioXHoras * 1.2 * duracion;  
        }else{
            precioBillete = precioXHoras * duracion; 
        }
        EmpresaCruceros.recaudacion += precioBillete; 
    }

    @Override
    public String toString() {
        return "Viaje{" + ", ID=" + ID + ", origen=" + origen + ", destino=" + destino + ", fechaInicioViaje=" + fechaInicioViaje + ", horaPartida=" + horaPartida + ", precio=" + precio + ", embarcacion=" + embarcacion + ", ="  + '}';
    }


}
