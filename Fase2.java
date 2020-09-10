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
    }
}
