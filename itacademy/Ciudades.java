package itacademy;

import java.util.*;

public class Ciudades {
    String nombreA;
    String nombreB;
    String nombreC;
    String nombreD;
    String nombreE;
    String nombreF;

    public Ciudades() {

    }
    List<String> nombreCiudades = new ArrayList<>();

    public List<String> getNombres(){//GETTER
        return nombreCiudades;
    }
    public void setNombre(String nombreCiudad) {//SETTER
        nombreCiudades.add(nombreCiudad);
    }
}