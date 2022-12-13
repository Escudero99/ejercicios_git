package Clases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sorteo {

    private List<UsuarioApp> participantes;
    private int numeroGanadores;

    public Sorteo(List<UsuarioApp> participantes, int numeroGanadores) {
        this.participantes = participantes;
        this.numeroGanadores = numeroGanadores;
    }
    public Sorteo(List<UsuarioApp> participantes) {
        this.participantes = participantes;
        this.numeroGanadores = 1;
    }

    public void paripe(){
        boolean ejecutar = true;
        Scanner leer = new Scanner(System.in);
        char yn = ' ';
        UsuarioApp ganador;
        System.out.println("#####################################");
        System.out.println("####### COMIENZO DEL SORTEO #########");
        System.out.println("#####################################");
        System.out.println("### LOS PARTICIPANTES DE HOY SON: ###");
        System.out.println("#####################################");
        this.mostrarParticipantes();
        do {
            yn = ' ';
            System.out.println("#####################################");
            System.out.println("###### EL SORTEO COMIENZA EN: #######");
            System.out.println("#####################################");
            System.out.println("################   3   ##############");
            System.out.println("#####################################");
            System.out.println("################   2   ##############");
            System.out.println("#####################################");
            System.out.println("################   1   ##############");
            ganador = this.ganador();
            this.sortear(ganador);
            System.out.println("#####################################");
            System.out.println("########## EL GANADOR ES: ###########");
            System.out.println("#####################################");
            System.out.println("########## " + ganador + " ###########");
            System.out.println("#####################################");
            System.out.println("#####################################");
            System.out.println("####### EL ESTADO ACTUAL ES: ########");
            System.out.println("#####################################");
            this.mostrarParticipantes();
            while ( yn!='y' && yn!='n'){
                System.out.println("#####################################");
                System.out.print("### ¿VOLVER A SORTEAR? [y/n]: ");
                yn = leer.nextLine().charAt(0);
                System.out.println("#####################################");
            }
            if(yn == 'n') ejecutar=false;
        }while(ejecutar);
    }

    private List<UsuarioApp> ganador() {
        Random ganador = new Random();
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<UsuarioApp> ganadores = new ArrayList<>();
        for (int i=0; i<this.numeroGanadores-1; i++){
            int z = ganador.nextInt(0,this.participantes.size()-1);
            if(!ids.contains(z)){
                ids.add(z);
                ganadores.add();
            }
        }
        return ganadores;
    }

    private void sortear(List<UsuarioApp> ganadores) {
        for (UsuarioApp u: this.participantes) {
            if (ganadores.contains(u)) u.ganarSorteo();
            u.participarSorteo();
        }
    }

    private void mostrarParticipantes() {
        for (UsuarioApp p : this.participantes) {
            System.out.println("###### "+p+" con: "+p.getNumVictoriasSorteo()+"/"+ p.getNumParticipacionesSorteo() +" victorias ######");
        }
    }
}
