import Clases.Sorteo;
import Clases.UsuarioApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("#####################################");
            System.out.println("#### ELIGE, ¿QUÉ QUIERES HACER? #####");
            System.out.println("#####################################");
            System.out.println("######## 1.- SORTEO EJEMPLO #########");
            System.out.println("######## 2.- SORTEO PERSONALIZADO ###");
            System.out.println("#####################################");
            opcion = leer.nextInt();
            if(opcion<1 || opcion>3){
                System.out.println("#####################################");
                System.out.println("####### OPCIÓN NO DISPONIBLE ########");
                System.out.println("#####################################");
            }
        }while (opcion<0 || opcion>3);
        switch(opcion){
            case 1:
                sorteoPorDefecto();
                break;
            case 2:
                break;
            default:
                break;
        }
    }

    public static void sorteoPorDefecto(){
        UsuarioApp pepe = new UsuarioApp("Pepe");
        UsuarioApp paco = new UsuarioApp("Paco");
        UsuarioApp pipi = new UsuarioApp("Pipi");
        UsuarioApp papa = new UsuarioApp("Papa");
        UsuarioApp pipo = new UsuarioApp("Pipo");
        List<UsuarioApp> participantes = new ArrayList<UsuarioApp>();
        participantes.add(pepe);
        participantes.add(paco);
        participantes.add(pipi);
        participantes.add(papa);
        participantes.add(pipo);
        Sorteo sorteo = new Sorteo(participantes);
        sorteo.mainSorteo();
    }
}