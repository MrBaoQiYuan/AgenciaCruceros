package logica;

import java.util.Scanner;

public class Pasajero {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    private Pasaporte pasaporte;
    private int edad;
    public final int cantMaxEquipajeMano = 1;
    private double pesoEquipajeMano;
    private int cantValija;
    public final int cantMaxValija = 2;
    public final int PesoMaxValija = 25;
    private double pesoValija;
    private boolean premium; 

    public Pasajero(Pasaporte pasaporte, int edad, int cantValija, double pesoValija) {
        this.pasaporte = pasaporte;
        this.edad = edad;
        this.cantValija = cantValija;
        this.pesoValija = pesoValija;
    }

    public Pasajero() {
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantValija() {
        return cantValija;
    }

    public void setCantValija(int cantValija) {
        this.cantValija = cantValija;
    }

    public double getPesoValija() {
        return pesoValija;
    }

    public void setPesoValija(double pesoValija) {
        this.pesoValija = pesoValija;
    }

    public double getPesoEquipajeMano() {
        return pesoEquipajeMano;
    }

    public void setPesoEquipajeMano(double pesoEquipajeMano) {
        this.pesoEquipajeMano = pesoEquipajeMano;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    
    

    @Override
    public String toString() {
        return "Pasajero{" + "pasaporte=" + pasaporte + ", edad=" + edad + ", cantEquipajeMano=" + cantMaxEquipajeMano + ", cantValija=" + cantValija + ", pesoValija=" + pesoValija + '}';
    }

}
                        