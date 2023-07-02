package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viaje {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    int ID; 
    OrigenDestinos origen;
    OrigenDestinos destino;
    LocalDate fechaInicioViaje;
    LocalTime horaPartida;
    int precio;
    public Embarcacion embarcacion;
    private ArrayList<ViajeExtraRegional> listadoViajesExtraRegionales;
    private ArrayList<ViajeRegional> listadoViajesRegionales;
    protected int duracion; 
    protected double precioXHora;
    protected boolean clasePremium; 
    
    public Viaje() {
    }

    public Viaje(int ID, OrigenDestinos origen, OrigenDestinos destino, LocalDate fechaInicioViaje, LocalTime horaPartida, Embarcacion embarcacion, int duracion) {
        this.ID = ID; 
        this.origen = origen;
        this.destino = destino;
        this.fechaInicioViaje = fechaInicioViaje;
        this.horaPartida = horaPartida;
        this.embarcacion = embarcacion;
        this.listadoViajesRegionales = new ArrayList<>();
        this.listadoViajesExtraRegionales = new ArrayList <>();
        this.duracion = duracion; 
        
        List<Viaje> listaTodosViajes = new ArrayList<>();
        listaTodosViajes.addAll(listadoViajesRegionales);
        listaTodosViajes.addAll(listadoViajesExtraRegionales);

    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
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

    public ArrayList<ViajeExtraRegional> getListadoViajesExtraRegionales() {
        return listadoViajesExtraRegionales;
    }

    public void setListadoViajesExtraRegionales(ArrayList<ViajeExtraRegional> listadoViajesExtraRegionales) {
        this.listadoViajesExtraRegionales = listadoViajesExtraRegionales;
    }

    public ArrayList<ViajeRegional> getListadoViajesRegionales() {
        return listadoViajesRegionales;
    }

    public void setListadoViajesRegionales(ArrayList<ViajeRegional> listadoViajesRegionales) {
        this.listadoViajesRegionales = listadoViajesRegionales;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //HAY OVERRIDE DE ESTE METODO. SEGUN SEA REGIONAL O EXTRAREGIONAL. 
    public void recaudarPrecio(double precioXHoras, int duracion, boolean clasePremium) {
    }


    @Override
    public String toString() {
        return "Viaje{" + "ID=" + ID + ", origen=" + origen + ", destino=" + destino + ", fechaInicioViaje=" + fechaInicioViaje + ", horaPartida=" + horaPartida + ", precio=" + precio + ", embarcacion=" + embarcacion + ", listadoViajesExtraRegionales=" + listadoViajesExtraRegionales + ", listadoViajesRegionales=" + listadoViajesRegionales + ", duracion=" + duracion + '}';
    }

//    void ajustarCapacidadPasajeros() {
//        embarcacion.ajustarCapacidadPasajeros(embarcacion, precio);
//    }

//    void encontrarPasajeroPasaporte(String pasaporteBusqueda) {
//        embarcacion.encontrarPasajeroPasaporte(pasaporteBusqueda);
//    }
    
   
}
