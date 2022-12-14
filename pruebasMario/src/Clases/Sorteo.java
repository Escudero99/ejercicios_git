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

    public void mainSorteo(){
        boolean ejecutar = true;
        Scanner leer = new Scanner(System.in);
        char yn = ' ';
        ArrayList<UsuarioApp> ganadores;
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
            System.out.println("##############   3   ################");
            System.out.println("#####################################");
            System.out.println("##############   2   ################");
            System.out.println("#####################################");
            System.out.println("##############   1   ################");
            ganadores = this.ganadores();
            this.sortear(ganadores);
            if(this.numeroGanadores==1){
                System.out.println("#####################################");
                System.out.println("########## EL GANADOR ES: ###########");
                System.out.println("#####################################");
            }else {
                System.out.println("#####################################");
                System.out.println("######## LOS GANADORES SON: #########");
                System.out.println("#####################################");
            }
            this.mostrarGanadores(ganadores);
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
        System.out.println("#####################################");
        System.out.println("##### GRACIAS POR USAR SORTEAPP #####");
        System.out.println("#####            ME©            #####");
        System.out.println("#####################################");
    }

    private ArrayList<UsuarioApp> ganadores() {
        Random ganador = new Random();
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<UsuarioApp> ganadores = new ArrayList<>();
        for (int i=0; i<this.numeroGanadores; i++){
            int z = ganador.nextInt(0,this.participantes.size()-1);
            if(!ids.contains(z)){
                ids.add(z);
                ganadores.add(this.participantes.get(z));
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
    private void mostrarGanadores(List<UsuarioApp> ganadores) {
        for (UsuarioApp p : ganadores) {
            System.out.println("############### "+p+" ################");
        }
    }
}
