package itacademy;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //FASE 1
        Ciudades ciudades = new Ciudades();
        int i;
        for (i = 1; i <= 6; i++){
            Scanner nombreCiudadObj = new Scanner(System.in);
            System.out.println("Introduzca el nombre de la ciudad " + i + ":");
            ciudades.setNombre(nombreCiudadObj.nextLine());
        }
        i = 1;
        for (String ciudad : ciudades.getNombres()){
            System.out.println("La ciudad " + i + " es: " + ciudad);
            i++;
        }

        //FASE 2
        String[] arrayCiutats = new String[6];
        i = 0;
        for (String ciudad : ciudades.getNombres()){
            arrayCiutats[i] = ciudad;
            i++;
        }
        Arrays.sort(arrayCiutats);
        System.out.println("Lista de ciudades ordenadas alfabéticamente:");
        for(i = 0; i < arrayCiutats.length; i++){
            System.out.println(arrayCiutats[i]);
        }

        //FASE 3
        String[] ArrayCiutatsModificades = new String[arrayCiutats.length];
        for(i = 0; i < arrayCiutats.length; i++){
            ArrayCiutatsModificades[i] = arrayCiutats[i].replace('a','4');
        }
        Arrays.sort(ArrayCiutatsModificades);
        System.out.println("Lista de ciudades con la a cambiada por un 4 ordenadas alfabéticamente:");
        for(i = 0; i < ArrayCiutatsModificades.length; i++){
            System.out.println(ArrayCiutatsModificades[i]);
        }

        //FASE 4
        for (i = 0; i < arrayCiutats.length; i++){
            char[] toArray = arrayCiutats[i].toCharArray();
            System.out.println(Arrays.toString(toArray));
            int j = 0;
            char[] reversed = new char[toArray.length];
            for (int k = toArray.length-1; k >= 0; k--){
                reversed[j] = toArray[k];
                j++;
            }
            System.out.println("Y ahora el nombre invertido:");
            System.out.println(Arrays.toString(reversed));
        }
    }
}
