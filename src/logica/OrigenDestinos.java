package logica;

public enum OrigenDestinos {
    
    MONTEVIDEO ("Uruguay", true),
    USHUAIA("Argetina", true),
    RECIFE("Brasil", true),
    SANTIAGO("Chile", true),
    LIMA ("Peru", true),
    ISLAPASCUA ("Chile", true),
    ISLAGALAPAGOS ("Ecaudor", true),
    PUERTOMADRYN ("Argentina", true),
    RIOJANEIRO ("Brasil", true),
    CARTAGENA ("Colombia", true),
    
    LAHABANA ("Cuba", false),
    VENECIA("Italia", false),
    ACAPULCO ("Mexico", false),
    MIAMI ("EEUU", false),
    NUEVAYORK("EEUU", false),
    BANGKOK("Tailandia", false),
    TAIPEI("Taiwan", false),
    ATENAS("Grecia", false);
    
    private final String pais; 
    private final boolean Regional; 

    private OrigenDestinos(String pais, boolean Regional) {
        this.pais = pais;
        this.Regional = Regional;
    }

    public static OrigenDestinos getMONTEVIDEO() {
        return MONTEVIDEO;
    }

    public static OrigenDestinos getUSHUAIA() {
        return USHUAIA;
    }

    public static OrigenDestinos getRECIFE() {
        return RECIFE;
    }

    public static OrigenDestinos getSANTIAGO() {
        return SANTIAGO;
    }

    public static OrigenDestinos getLIMA() {
        return LIMA;
    }

    public static OrigenDestinos getISLAPASCUA() {
        return ISLAPASCUA;
    }

    public static OrigenDestinos getISLAGALAPAGOS() {
        return ISLAGALAPAGOS;
    }

    public static OrigenDestinos getPUERTOMADRYN() {
        return PUERTOMADRYN;
    }

    public static OrigenDestinos getRIOJANEIRO() {
        return RIOJANEIRO;
    }

    public static OrigenDestinos getCARTAGENA() {
        return CARTAGENA;
    }

    public static OrigenDestinos getLAHABANA() {
        return LAHABANA;
    }

    public static OrigenDestinos getVENECIA() {
        return VENECIA;
    }

    public static OrigenDestinos getACAPULCO() {
        return ACAPULCO;
    }

    public static OrigenDestinos getMIAMI() {
        return MIAMI;
    }

    public static OrigenDestinos getNUEVAYORK() {
        return NUEVAYORK;
    }

    public static OrigenDestinos getBANGKOK() {
        return BANGKOK;
    }

    public static OrigenDestinos getTAIPEI() {
        return TAIPEI;
    }

    public static OrigenDestinos getATENAS() {
        return ATENAS;
    }

    public String getPais() {
        return pais;
    }

    public boolean isRegional() {
        return Regional;
    }
}
