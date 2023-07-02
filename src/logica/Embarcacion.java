package logica;

import java.util.ArrayList;
import java.util.List;

public class Embarcacion {

    private int matricula;
    private String nombre;
    private int cantCamarotes;
    private final int maxCapPersonasXCamarotes = 4;
    private int cantCamarotesPremium;
    private int cantCamarotesNormales;
    private int cantSalones;
    private int cantCasinos;
    private int capacidadKgBodega;
    private boolean gym;
    private boolean piscina;
    private boolean capLleno = false;
    private ArrayList<Pasajero> listaPasajerosAbordo;
    private int camarotesPremiumRestantes;
    private int camarotesNormalesRestantes;

    public Embarcacion(int matricula, String nombre, int cantCamarotes, int cantSalones, int cantCasinos, int capacidadKgBodega, boolean gym, boolean piscina) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.cantCamarotes = cantCamarotes;
        this.cantSalones = cantSalones;
        this.cantCasinos = cantCasinos;
        this.capacidadKgBodega = capacidadKgBodega;
        this.gym = gym;
        this.piscina = piscina;
        this.listaPasajerosAbordo = new ArrayList<>();
        this.cantCamarotesPremium = (int) Math.ceil(cantCamarotes * 0.35);
        this.cantCamarotesNormales = cantCamarotes - cantCamarotesPremium;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantCasinos() {
        return cantCasinos;
    }

    public void setCantCasinos(int cantCasinos) {
        this.cantCasinos = cantCasinos;
    }

    public int getCapacidadKgBodega() {
        return capacidadKgBodega;
    }

    public void setCapacidadKgBodega(int capacidadKgBodega) {
        this.capacidadKgBodega = capacidadKgBodega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public ArrayList<Pasajero> getListaPasajerosAbordo() {
        return listaPasajerosAbordo;
    }

    public void setListaPasajerosAbordo(ArrayList<Pasajero> listaPasajerosAbordo) {
        this.listaPasajerosAbordo = listaPasajerosAbordo;
    }

    public boolean isCapLleno() {
        return capLleno;
    }

    public void setCapLleno(boolean capLleno) {
        this.capLleno = capLleno;
    }

    public int getCantCamarotesPremium() {
        return cantCamarotesPremium;
    }

    public void setCantCamarotesPremium(int cantCamarotesPremium) {
        this.cantCamarotesPremium = cantCamarotesPremium;
    }

    public int getCantCamarotesNormales() {
        return cantCamarotesNormales;
    }

    public void setCantCamarotesNormales(int cantCamarotesNormales) {
        this.cantCamarotesNormales = cantCamarotesNormales;
    }

    @Override
    public String toString() {
        return "Embarcacion{" + "matricula=" + matricula + ", nombre=" + nombre + ", cantCamarotes=" + cantCamarotes + ", maxCapPersonasXCamarotes=" + maxCapPersonasXCamarotes + ", cantSalones=" + cantSalones + ", cantCasinos=" + cantCasinos + ", capacidadKgBodega=" + capacidadKgBodega + ", gym=" + gym + ", piscina=" + piscina + ", listaPasajerosAbordo=" + listaPasajerosAbordo + '}';
    }

    public int capacidadMaxPasajeros() {
        return cantCamarotes * maxCapPersonasXCamarotes;
    }

    public int cantidadPasajerosActual() {
        return listaPasajerosAbordo.size();
    }

    public void agregarUnPasajero(Pasajero pasajero) {
        listaPasajerosAbordo.add(pasajero);
    }

    public void verListaPasajeros(Embarcacion embarcacion) {
        for (Pasajero e : listaPasajerosAbordo) {
            System.out.println(e.toString());
        }
    }

    void ajustarCapacidadPasajeros() {

        int cantPersonasPremium = 0;
        int cantPersonasNormales = 0;
        for (Pasajero e : listaPasajerosAbordo) {
            if (e.isPremium()) {
                cantPersonasPremium++;
            } else {
                cantPersonasNormales++;
            }
        }

        camarotesPremiumRestantes = cantCamarotesPremium - (cantPersonasPremium / 4);
        camarotesNormalesRestantes = cantCamarotesNormales - (cantPersonasNormales / 4);
    }

    void visualizarOcupacionCamarotes() {
        System.out.println("Camarotes Premium: " + camarotesPremiumRestantes + "\nDisponibilidad camarotes normales: " + camarotesNormalesRestantes);
        if (camarotesPremiumRestantes <= 0 && camarotesNormalesRestantes <= 0) {
            capLleno = true;
        }
    }

    void buscarPasaporte(String pasaporteBusqueda) {
        Pasajero pasajeroPassEncontrado = null;
        for (Pasajero g : listaPasajerosAbordo) {
            if (g.getPasaporte().getNumPasaporte().equals(pasaporteBusqueda)) {
                pasajeroPassEncontrado = g;
                System.out.println(pasajeroPassEncontrado.toString());
            }
        }
        if (pasajeroPassEncontrado == null) {
            System.out.println("No se encontró ningún pasajero con ese pasaporte.");
        }
    }

    void buscarEdad(int edadPasajeroBusqueda) {
        Pasajero pasajeroEdadEncontrado = null;
        for (Pasajero h : listaPasajerosAbordo) {
            if (h.getEdad() == (edadPasajeroBusqueda)) {
                pasajeroEdadEncontrado = h;
                System.out.println(pasajeroEdadEncontrado.toString());
            }
        }
        if (pasajeroEdadEncontrado == null) {
            System.out.println("No se encontró ningún pasajero con esa edad.");
        }
    }

    void buscarNombreApellidos(String nombreBusqueda) {
        Pasajero pasajeroNombreEncontrado = null;
        for (Pasajero h : listaPasajerosAbordo) {
            if (h.getPasaporte().getNombreApellidos().equals(nombreBusqueda)) {
                pasajeroNombreEncontrado = h;
                System.out.println(pasajeroNombreEncontrado.toString());
            }
        }
        if (pasajeroNombreEncontrado == null) {
            System.out.println("No se encontró ningún pasajero con ese nombre.");
        }
    }

    void agregarGrupoPasajeros(Pasajero pasajero) {

                listaPasajerosAbordo.add(pasajero);

    }

}
