import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //FASE 1
        Scanner myObjA = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la ciudad A:");
        String a = myObjA.nextLine();
        Scanner myObjB = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la ciudad B:");
        String b = myObjB.nextLine();
        Scanner myObjC = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la ciudad C:");
        String c = myObjC.nextLine();
        Scanner myObjD = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la ciudad D:");
        String d = myObjD.nextLine();
        Scanner myObjE = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la ciudad E:");
        String e = myObjE.nextLine();
        Scanner myObjF = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la ciudad F:");
        String f = myObjF.nextLine();
        System.out.println("La ciudad A es: " + a);
        System.out.println("La ciudad B es: " + b);
        System.out.println("La ciudad C es: " + c);
        System.out.println("La ciudad D es: " + d);
        System.out.println("La ciudad E es: " + e);
        System.out.println("La ciudad F es: " + f);

        //FASE 2
        String[] ciutats = new String[]{a,b,c,d,e,f};
        Arrays.sort(ciutats);
        for(int i = 0; i < ciutats.length; i++){
            System.out.println(ciutats[i]);
        }

        //FASE 3
        String[] ArrayCiutatsModificades = new String[ciutats.length];
        for(int i = 0; i < ciutats.length; i++){
            ArrayCiutatsModificades[i] = ciutats[i].replace('a','4');
        }
        Arrays.sort(ArrayCiutatsModificades);
        for(int i = 0; i < ArrayCiutatsModificades.length; i++){
            System.out.println(ArrayCiutatsModificades[i]);
        }

        //FASE 4
        for (int i = 0; i < ciutats.length; i++){
            char[] toArray = ciutats[i].toCharArray();
            System.out.println(Arrays.toString(toArray));
            //for (char toChar : toArray){
            //    System.out.println(toChar);
            //}
            int counter = 0;
            char[] reversed = new char[toArray.length];
            for (int j = toArray.length-1; j >= 0; j--){
                reversed[counter] = toArray[j];
                counter++;
            }
            System.out.println(Arrays.toString(reversed));
        }
    }
}
