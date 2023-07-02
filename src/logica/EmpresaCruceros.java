package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import logica.Servicios.ValidadorDeDatos;

public class EmpresaCruceros {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();

    private String nombre;
    private ArrayList<ViajeExtraRegional> listadoViajesExtraRegionales;
    private ArrayList<ViajeRegional> listadoViajesRegionales;
    private ArrayList<Embarcacion> listaEmbarcaciones;
    static double recaudacion = 0;

    //constructor con 7 embarcaciones
    public EmpresaCruceros(String nombre) {
        this.nombre = nombre;
        this.listadoViajesExtraRegionales = new ArrayList<>();
        this.listadoViajesRegionales = new ArrayList<>();
        this.listaEmbarcaciones = new ArrayList<>(7);

        Embarcacion embarcacion1 = new Embarcacion(1234567, "AA", 100, 4, 2, 15000, true, true);
        Embarcacion embarcacion2 = new Embarcacion(5678, "BB", 200, 2, 6, 15000, true, false);
        Embarcacion embarcacion3 = new Embarcacion(91011, "CC", 300, 3, 5, 3000, false, true);
        Embarcacion embarcacion4 = new Embarcacion(121314, "DD", 400, 4, 4, 3500, false, false);
        Embarcacion embarcacion5 = new Embarcacion(151617, "EE", 500, 5, 3, 4500, true, true);
        Embarcacion embarcacion6 = new Embarcacion(181920, "FF", 600, 6, 2, 5500, false, false);
        Embarcacion embarcacion7 = new Embarcacion(212223, "GG", 700, 7, 0, 6000, true, false);
        listaEmbarcaciones.add(embarcacion1);
        listaEmbarcaciones.add(embarcacion2);
        listaEmbarcaciones.add(embarcacion3);
        listaEmbarcaciones.add(embarcacion4);
        listaEmbarcaciones.add(embarcacion5);
        listaEmbarcaciones.add(embarcacion6);
        listaEmbarcaciones.add(embarcacion7);

        ViajeRegional viajeRegional1 = new ViajeRegional(1, OrigenDestinos.MONTEVIDEO, OrigenDestinos.USHUAIA,
                LocalDate.of(2022, 06, 12), LocalTime.of(22, 25, 00), embarcacion1, 100);
        ViajeRegional viajeRegional2 = new ViajeRegional(2, OrigenDestinos.RECIFE, OrigenDestinos.SANTIAGO,
                LocalDate.of(2023, 06, 12), LocalTime.of(22, 25, 00), embarcacion2, 360);
        ViajeRegional viajeRegional3 = new ViajeRegional(3, OrigenDestinos.LIMA, OrigenDestinos.ISLAPASCUA,
                LocalDate.of(2024, 06, 12), LocalTime.of(22, 25, 00), embarcacion3, 110);
        ViajeRegional viajeRegional4 = new ViajeRegional(4, OrigenDestinos.ISLAGALAPAGOS, OrigenDestinos.PUERTOMADRYN,
                LocalDate.of(2025, 06, 12), LocalTime.of(22, 25, 00), embarcacion4, 350);
        ViajeExtraRegional viajeExtraRegional5 = new ViajeExtraRegional(5, OrigenDestinos.LAHABANA, OrigenDestinos.VENECIA,
                LocalDate.of(2026, 06, 12), LocalTime.of(22, 25, 00), embarcacion5, 500);
        ViajeExtraRegional viajeExtraRegional6 = new ViajeExtraRegional(6, OrigenDestinos.ACAPULCO, OrigenDestinos.MIAMI,
                LocalDate.of(2027, 06, 12), LocalTime.of(22, 25, 00), embarcacion6, 480);
        ViajeExtraRegional viajeExtraRegional7 = new ViajeExtraRegional(7, OrigenDestinos.NUEVAYORK, OrigenDestinos.BANGKOK,
                LocalDate.of(2028, 06, 12), LocalTime.of(22, 25, 00), embarcacion7, 700);

        listadoViajesRegionales.add(viajeRegional1);
        listadoViajesRegionales.add(viajeRegional2);
        listadoViajesRegionales.add(viajeRegional3);
        listadoViajesRegionales.add(viajeRegional4);
        listadoViajesExtraRegionales.add(viajeExtraRegional5);
        listadoViajesExtraRegionales.add(viajeExtraRegional6);
        listadoViajesExtraRegionales.add(viajeExtraRegional7);
        
    }

    //GETTER Y SETTER 
    public String getNombre() {
        return nombre;
    }

    //GETTER Y SETTER 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //GETTER Y SETTER 
    public ArrayList<ViajeExtraRegional> getListadoViajesExtraRegionales() {
        return listadoViajesExtraRegionales;
    }

    //GETTER Y SETTER 
    public void setListadoViajesExtraRegionales(ArrayList<ViajeExtraRegional> listadoViajesExtraRegionales) {
        this.listadoViajesExtraRegionales = listadoViajesExtraRegionales;
    }

    //GETTER Y SETTER 
    public ArrayList<ViajeRegional> getListadoViajesRegionales() {
        return listadoViajesRegionales;
    }

    //GETTER Y SETTER 
    public void setListadoViajesRegionales(ArrayList<ViajeRegional> listadoViajesRegionales) {
        this.listadoViajesRegionales = listadoViajesRegionales;
    }

    //GETTER Y SETTER 
    public ArrayList<Embarcacion> getListaEmbarcaciones() {
        return listaEmbarcaciones;
    }

    //GETTER Y SETTER 
    public void setListaEmbarcaciones(ArrayList<Embarcacion> listaEmbarcaciones) {
        this.listaEmbarcaciones = listaEmbarcaciones;
    }

    //LISTA DE VIAJES DISPONIBLES
    void verListaViajes() { // Ver lista de viajes 
        System.out.println("Viajes EXTRA Regionales");
        for (ViajeExtraRegional e : listadoViajesExtraRegionales) {
            System.out.println(e.toString());
        }

        System.out.println("Viajes Regionales");
        for (ViajeRegional e : listadoViajesRegionales) {
            System.out.println(e.toString());
        }
    }

    // PIDE EDAD
    public int edadPasajero() {
        int edad = 0;
        String edadS = null;
        do {
            System.out.println("¿Cuál es la edad del pasajero?");
            edadS = input.next();
            edad = Integer.parseInt(edadS);
            if (!ValidadorDeDatos.validarCaracteresNumericos(edadS)) {
                System.out.println("Introduzca una edad válida (solo números).");
                continue;
            }
            try {
                if (edad >= 18 && edad < 100) {
                    System.out.println("Edad guardada correctamente.");
                } else if (edad > 100) {
                    System.out.println("Parece una persona demasiado mayor. Introduzca una edad correcta.");
                    edad = edadPasajero();
                } else {
                    System.out.println("Lo siento. Un menor no puede viajar solo.");
                    edad = edadPasajero();
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca una edad válida.");
            }

        } while (!ValidadorDeDatos.validarCaracteresNumericos(edadS));
        return edad;
    }

    // CREAR PASAPORTE
    public Pasaporte crearPasaporte() {
//PASAPORTE
        String numPasaporte = null;
        do {
            System.out.println("Introduce tu numero de pasaporte.");
            numPasaporte = input.next();
        } while (!ValidadorDeDatos.validarPasaporte(numPasaporte));
//NOMBRE Y APELLIDOS
        String nombreApellidos = null;
        do {
            System.out.println("Introduce tu nombre completo");
            nombreApellidos = input.next();
        } while (!ValidadorDeDatos.validarCaracteresAlfabeticosSpanish(nombreApellidos));
//NACIONALIDAD
        System.out.println("Introduce tu nacionalidad");
        String nacionalidad = null;
        do {
            nacionalidad = input.next();
        } while (!ValidadorDeDatos.validarCaracteresAlfabeticosSpanish(nacionalidad));
//SEXO 
        String sexo = null;
        do {
            System.out.println("Elige tu sexo M / H ");
            sexo = input.next();
        } while (!ValidadorDeDatos.validarSexo(sexo));

        String lugarNacimiento = null;
        do {
            System.out.println("Introduce tu lugar de nacimiento");
            lugarNacimiento = input.next();
        } while (!ValidadorDeDatos.validarCaracteresAlfabeticosSpanish(lugarNacimiento));

// fecha de expedicion de pasaporte
        String fechaString = null;
        System.out.println("Introduce la fecha de expedicion de tu pasaporte en formato dd/MM/yyyy");
        do {
            fechaString = input.next();
            System.out.println("La fecha ingresada es: " + fechaString);
        } while (!ValidadorDeDatos.validarFecha(fechaString));
        LocalDate fechaExpedicion = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

// fecha de caducidad de pasaporte
        LocalDate fechaCaducidad = null;
        String fechaCad = null;
        System.out.println("Introduzca la fecha de caducidad de tu pasaporte en formato dd/MM/yyyy");
        do {
            fechaCad = input.next();
            System.out.println("La fecha de caducidad ingresada es: " + fechaCad);
        } while (!ValidadorDeDatos.validarFecha(fechaCad));
        fechaCaducidad = LocalDate.parse(fechaCad, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

//codigo seguridad DNI 
        System.out.println("Introduce el codigo de seguridad de tu DNI");
        String codigoSeguridad = input.next();

        Pasaporte pasaporte1 = new Pasaporte(numPasaporte, nombreApellidos, nacionalidad, sexo, lugarNacimiento, fechaExpedicion, fechaCaducidad, codigoSeguridad);

        return pasaporte1;

    }

    //CANTIDAD DE VALIJAS
    public int cantValijaPasajero() {
        System.out.println("¿Cuantas valijas piensa llevar? El maximo son 2.");
        String cantValijasS = null;
        int cantValijasOK = 0;
        do {
            System.out.println("Introduce un valor");
            cantValijasS = input.next();
            if (!ValidadorDeDatos.validarCantValijas(cantValijasS)) {
                System.out.println("Valor Invalido");
            }
        } while (!ValidadorDeDatos.validarCantValijas(cantValijasS));
        cantValijasOK = Integer.parseInt(cantValijasS);
        return cantValijasOK;
    }

    //PESO DE VALIJAS
    public double pesoValijaPasajero(int cantValijas) {
        double pesoTotal = 0;
        double pesoValijaUnitaria = 0;
        String pesoValijaUnitariaS = null;
        int numeroValija = 1;
        for (int i = 0; i < cantValijas; i++) {
            do {
                System.out.println("introduce el peso de la valija " + numeroValija);
                pesoValijaUnitariaS = input.next();
            } while (!ValidadorDeDatos.validarPesoValijas(pesoValijaUnitariaS));
            pesoValijaUnitaria = Integer.parseInt(pesoValijaUnitariaS);

            Pasajero pasajeroTemp = new Pasajero();
            numeroValija++;

            if (pesoValijaUnitaria < pasajeroTemp.PesoMaxValija) {
                pesoTotal += pesoValijaUnitaria;
            } else {
                pesoTotal += 25;
            }
        }

        return pesoTotal;
    }

    //REQUISITO DE PISCINA
    boolean requisitoPiscina() {
        System.out.println("¿Quiere piscina?");
        String respuestaPiscina = input.next();
        boolean piscina = respuestaPiscina.equalsIgnoreCase("si");
        return piscina;
    }

    //REQUISITO DE GYM
    boolean requisitoGym() {
        System.out.println("¿Quiere gimnasio?");
        String respuestaGym = input.next();
        boolean gym = respuestaGym.equalsIgnoreCase("si");
        return gym;
    }

    // VER PASAJEROS EN EMBARCACION
    void verListaPasajeros() {
        System.out.println("Lista de pasajeros:");
        int numEmbarcacion = 1;
        for (Embarcacion e : listaEmbarcaciones) {
            System.out.println("Embarcacion" + numEmbarcacion);
            e.verListaPasajeros(e);

            numEmbarcacion++;

        }
    }

//    // VER SI HAY SITIO PARA GRUPO FAMILIAR EN EMBARCACION 
//    private boolean chequeoCapacidadFamiliar(int cantPersonasGrupo, Embarcacion embarcacionGrupo) {
//        return cantPersonasGrupo < embarcacionGrupo.capacidadPasajerosDisponibles();
//    }
    //SE CREA PASAPORTE, REQUISITOS, Y ASIGNA EMBARCACION.  
    void venderBillete() {
        System.out.println("¿Cuantos pasajeros son?"
                + "\nOpcion 1: Un solo pasajero"
                + "\nOpcion 2: Un grupo de pasajeros");
        int cantPasajerosOpcion = input.nextInt();
        switch (cantPasajerosOpcion) {
            case 1 -> {
                int edadBillete = edadPasajero();                 //Asignamos edad
                int cantPasajeros = 1;                            //Cantidad de pasajeros
                Pasaporte pasaporteBillete = crearPasaporte(); //Asignamos pasaporte al pasajero

                int cantValijas = cantValijaPasajero();     //Asignamos numero valijas
                double cantPeso = pesoValijaPasajero(cantValijas); // Asignamos peso de valijas
                //Creaccion de pasajero. 
                Pasajero pasajeroBillete = new Pasajero(pasaporteBillete, edadBillete, cantValijas, cantPeso);

                //Requisito 1: Piscina
                boolean piscinaBillete = requisitoPiscina();
                //Requisito 2:  gym
                boolean gymBillete = requisitoGym();

                //Requisito 3: FECHA DE LA QUE A PARTIR SE VIAJARÁ 
                String fechaStringViaje = null;
                System.out.println("Introduce la fecha en la que quieres viajar (dd/MM/yyyy): ");
                do {
                    fechaStringViaje = input.next();
                    System.out.println("La fecha ingresada es: " + fechaStringViaje);
                } while (!ValidadorDeDatos.validarFecha(fechaStringViaje));

                LocalDate fechaBillete = LocalDate.parse(fechaStringViaje, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                //ELEGIR VIAJE Y ASIGNAR USUARIO A LA EMBARCACION DEL VIAJE. 
                System.out.println("Para las caracteristicas de este viaje, tenemos los siguientes viajes disponibles:");
                Viaje viajeBillete = viajeOptimo(fechaBillete, piscinaBillete, gymBillete, cantPasajeros, pasajeroBillete);

            }
            case 2 -> { //edad, nPasajeros, pasaporte, cantValijas, cantPeso. 
                System.out.println("Entendido. Vamos a verificar si hay espacio para el grupo."
                        + "¿Cuantas personas son en total? ");
                int cantPersonasGrupo = input.nextInt();
//                crearGrupoPasajeros(cantPersonasGrupo);
                boolean piscinaBilleteGrupo = requisitoPiscina();
                boolean gymBilleteGrupo = requisitoGym();

                //Requisito: FECHA DE LA QUE A PARTIR SE VIAJARÁ 
                String fechaStringViajeGrupo = null;
                System.out.println("Introduce la fecha en la que quieres viajar (dd/MM/yyyy): ");
                do {
                    fechaStringViajeGrupo = input.next();
                    System.out.println("La fecha ingresada es: " + fechaStringViajeGrupo);
                } while (!ValidadorDeDatos.validarFecha(fechaStringViajeGrupo));

                LocalDate fechaBilleteGrupo = LocalDate.parse(fechaStringViajeGrupo, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                boolean pasajePremium = comprarPasajePremium();

//                List<Pasajero> grupoPasajeros = new ArrayList<>();
                Pasajero pasajeroGrupoBillete = null;
                for (int i = 0; i < cantPersonasGrupo; i++) {
                    int edadGrupo = crearEdadGrupo();
                    Pasaporte pasaporteGrupo = null; //crearPasaportesGrupo(); //Asignamos pasaporte al pasajero
                    int cantValijasGrupo = cantValijasGrupo();     //Asignamos numero valijas
                    double cantPesoGrupo = cantPesoGrupo(cantValijasGrupo); // Asignamos peso de valijas

                    pasajeroGrupoBillete = new Pasajero(pasaporteGrupo, edadGrupo, cantValijasGrupo, cantPesoGrupo);
                }

                //ELEGIR VIAJE Y ASIGNAR USUARIO A LA EMBARCACION DEL VIAJE. 
                System.out.println("Para las caracteristicas de este viaje, tenemos los siguientes viajes disponibles:");

                Viaje viajeBilleteGrupo = viajeOptimoGrupal(fechaBilleteGrupo, piscinaBilleteGrupo, gymBilleteGrupo, cantPersonasGrupo, pasajeroGrupoBillete, pasajePremium);
            }
        }
    }

    private Viaje viajeOptimo(LocalDate fechaCliente, boolean piscinaBillete, boolean gymBillete, int cantPasajeros, Pasajero pasajero) {
        //AÑADIMOS TODOS LOS VIAJES EXISTENTES A LISTATODOSVIAJES.
        List<Viaje> listaTodosViajes = new ArrayList<>();
        listaTodosViajes.addAll(listadoViajesRegionales);
        listaTodosViajes.addAll(listadoViajesExtraRegionales);
        //DE TODOS LOS VIAJES SE FILTRA A VIAJES CON FECHA POSTERIOR.
        List<Viaje> listaViajesEnFecha = new ArrayList<>();
        for (Viaje e : listaTodosViajes) {
            LocalDate fechaDeViaje = e.getFechaInicioViaje();
            if (fechaDeViaje.isAfter(fechaCliente)) {
                listaViajesEnFecha.add(e);
            }
        }

        List<Viaje> listaViajesAdecuados = new ArrayList<>();
        Viaje viajeElegido = null;
        if (listaViajesEnFecha.isEmpty()) {
            System.out.println("No hay viajes programados para fechas posteriores a la ingresada.");
        } else {
            System.out.println("Viajes programados para la fecha " + fechaCliente + " o posteriores:");
            //SE VISUALIZAN LOS VIAJES QUE COINCIDAN CON LOS REQUISITOS DE PISCINA Y GYM 
            for (Viaje f : listaViajesEnFecha) {
                if (f.getEmbarcacion().isPiscina() == piscinaBillete && f.getEmbarcacion().isGym() == gymBillete && !f.embarcacion.isCapLleno()) {
                    System.out.println(f.toString());
                    listaViajesAdecuados.add(f);
                }
            }

            boolean viajeYaComprado = false;
            do {

                System.out.println("Elija el viaje que desea comprar.");
                //ELEGIMOS EL VIAJE QUE DESEAMOS COMPRAR. 
                int elegirViaje = input.nextInt();
                String respuestaPremium = "";
                int duracion = 0;
                for (Viaje f : listaViajesAdecuados) {
                    if (elegirViaje == f.getID()) {
                        viajeYaComprado = true;
                        //Agregamos pasajero a la embarcacion.
                        f.embarcacion.agregarUnPasajero(pasajero);
                        //Averiguamos duracion del viaje. 
                        duracion = f.getDuracion();
                        //Averiguamos si el pasajero quiere billete premium. 
                        do {
                            System.out.println("¿Desea comprar el billete en clase premium? ");
                            respuestaPremium = input.next();

                        } while (ValidadorDeDatos.validarRespuestaSiNo(respuestaPremium));

                        boolean clasePremium;
                        if (respuestaPremium.equalsIgnoreCase("si")) {
                            clasePremium = true;
//                        f.ajustarCapacidadPasajeros();
                        } else {
                            clasePremium = false;
                        }
                        //Se ajusta el aforo. 
                        pasajero.setPremium(clasePremium);
                        f.embarcacion.ajustarCapacidadPasajeros();

                        //Averiguamos el precio total segun el tipo de viaje. 
                        f.recaudarPrecio(recaudacion, duracion, clasePremium);

                    } else {

                        System.out.println("Valor invalido. ");

                    }
                }
            } while (viajeYaComprado == false);

        }
        return viajeElegido;
    }

    private Viaje viajeOptimoGrupal(LocalDate fechaCliente, boolean piscinaBillete, boolean gymBillete, int cantPersonasGrupo, Pasajero pasajero, boolean premiumPasaje) {
        Viaje viajeElegido = null;

        //AÑADIMOS TODOS LOS VIAJES EXISTENTES A LISTATODOSVIAJES.
        List<Viaje> listaTodosViajes = new ArrayList<>();
        listaTodosViajes.addAll(listadoViajesRegionales);
        listaTodosViajes.addAll(listadoViajesExtraRegionales);
        //DE TODOS LOS VIAJES SE FILTRA A VIAJES CON FECHA POSTERIOR.
        List<Viaje> listaViajesEnFecha = new ArrayList<>();
        for (Viaje e : listaTodosViajes) {
            LocalDate fechaDeViaje = e.getFechaInicioViaje();
            if (fechaDeViaje.isAfter(fechaCliente)) {
                listaViajesEnFecha.add(e);
            }
        }

        List<Viaje> listaViajesAdecuados = new ArrayList<>();
        if (listaViajesEnFecha.isEmpty()) {
            System.out.println("No hay viajes programados para fechas posteriores a la ingresada.");
        } else {
            System.out.println("Viajes programados para la fecha " + fechaCliente + " o posteriores:");
            //SE VISUALIZAN LOS VIAJES QUE COINCIDAN CON LOS REQUISITOS DE PISCINA Y GYM 
            for (Viaje f : listaViajesEnFecha) {
                if (f.getEmbarcacion().isPiscina() == piscinaBillete && f.getEmbarcacion().isGym() == gymBillete && !f.embarcacion.isCapLleno()) {
                    System.out.println(f.toString());
                    listaViajesAdecuados.add(f);
                }
            }

            System.out.println("Elija el viaje que desea comprar.");
            //ELEGIMOS EL VIAJE QUE DESEAMOS COMPRAR. 
            int elegirViaje = input.nextInt();
            for (int i = 0; i < cantPersonasGrupo; i++) {

                int duracion = 0;
                for (Viaje f : listaViajesAdecuados) {
                    if (elegirViaje == f.getID()) {
                        //Agregamos pasajero a la embarcacion.
                        f.embarcacion.agregarGrupoPasajeros(pasajero);
                        //Averiguamos duracion del viaje. 
                        duracion = f.getDuracion();

                    }
                    f.embarcacion.ajustarCapacidadPasajeros();

                    //Averiguamos el precio total segun el tipo de viaje. 
                    f.recaudarPrecio(recaudacion, duracion, premiumPasaje);

                }

            }

        }
        return viajeElegido;

    }

    void verDatosEstadisticos() {

        System.out.println("¿Que datos desea consultar?"
                + "\nOpcion 1: Recaudacion total"
                + "\nOpcion 2: Ver camarotes disponibles."
                + "\nOpcion 3: Ver pasajeros segun datos introducidos.");

        int opcionesStats = input.nextInt();

        switch (opcionesStats) {
            case 1 ->
                System.out.println(EmpresaCruceros.recaudacion);
            case 2 -> {
                int contador = 1;
                for (Embarcacion e : listaEmbarcaciones) {
                    e.visualizarOcupacionCamarotes();
                    System.out.println("");
                    contador++;
                }
            }

            case 3 -> {
                System.out.println("Elige el dato con el que quieres encontrar a tu pasajero. "
                        + "\nOpcion 10: Pasaporte"
                        + "\nOpcion 11: Nombre y apellidos"
                        + "\nOpcion 12: Edad");
                int opcionEncontrarPasajero = input.nextInt();
                switch (opcionEncontrarPasajero) {
                    case 10 -> {
                        System.out.println("Introduce el pasaporte del pasajero a buscar");
                        String pasaporteBusqueda = input.next();
                        for (Embarcacion e : listaEmbarcaciones) {
                            e.buscarPasaporte(pasaporteBusqueda);
                        }
                    }

                    case 11 -> {
                        System.out.println("Introduce el nombre y apellidos del pasajero a buscar");
                        String nombreBusqueda = input.next();
                        for (Embarcacion e : listaEmbarcaciones) {
                            e.buscarNombreApellidos(nombreBusqueda);
                        }
                    }

                    case 12 -> {
                        System.out.println("Introduce la edad del pasajero a buscar");
                        int edadPasajeroBusqueda = input.nextInt();
                        for (Embarcacion e : listaEmbarcaciones) {
                            e.buscarEdad(edadPasajeroBusqueda);

                        }
                    }
                }
            }
        }
    }

    void disponibilidadCruceros() {
        int numEmbarcacion = 1;
        for (Embarcacion e : listaEmbarcaciones) {
            if (e.isCapLleno()) {
                System.out.println("La embarcacion " + numEmbarcacion + " esta llena.");
            } else {
                System.out.println("La embarcacion " + numEmbarcacion + " esta disponible.");
            }
            numEmbarcacion++;
        }
    }
    //    public void crearGrupoPasajeros(int cantPersonasGrupo) {
    //
    //        System.out.println("Introduce la matricula de la embarcacion en la que deseas añadir los pasajeros.");
    //        int matriculaGrupo = input.nextInt();
    //        for (Embarcacion f : listaEmbarcaciones) {
    //            if (f.getMatricula() == matriculaGrupo) {
    //                Pasajero p = new Pasajero();
    //                f.agregarUnPasajero(p);
    //            }
    //        }
    //
    //    }
    //    private Pasaporte crearPasaportesGrupo() {
    //        return Pasaporte pasaporte = null;
    //    }

    private int cantValijasGrupo() {
        int cantValijasGrupo = (int) (Math.random() * 3);
        return cantValijasGrupo;
    }

    private int cantPesoGrupo(int cantValijasGrupo) {
        int peso2 = 0;
        int pesoTotal2 = 0;
        for (int i = 0; i < cantValijasGrupo; i++) {
            peso2 = random.nextInt(25) + 1;
            pesoTotal2 += peso2;
        }
        return pesoTotal2;
    }

    private int crearEdadGrupo() {
        int edad = random.nextInt(83) + 18;
        return edad;
    }

    private boolean requisitoPiscinaGrupo() {
        return random.nextBoolean();
    }

    private boolean requisitoGymGrupo() {
        return random.nextBoolean();
    }

    private boolean comprarPasajePremium() {
        System.out.println("¿Quiere comprar el pasaje Premium?");
        String pasajePremiumS = input.next();
        boolean pasajePremium = pasajePremiumS.equalsIgnoreCase("si");
        return pasajePremium;
    }
    
   public void hardcodeo(int cantPasajeros, int viajeID){
       
   } 
   
}
